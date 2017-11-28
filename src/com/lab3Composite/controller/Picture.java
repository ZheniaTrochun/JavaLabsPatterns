package com.lab3Composite.controller;


import com.lab3Composite.models.Figure;
import com.lab3Composite.models.FigureComposite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Simple controller which holds list of figures
 */
public class Picture {
    private List<Figure> figures;

    public Picture() {
        this.figures = new ArrayList<>();
    }

    public Picture(List<Figure> figures) {
        this.figures = figures;
    }

    public boolean add(Figure figure) {
        return figures.add(figure);
    }

    public void drawAll() {
        figures.forEach(figure -> figure.draw());
    }

    public FigureComposite select(int xStart, int yStart, int xEnd, int yEnd) {
        return new FigureComposite(xStart, yStart, xEnd - xStart, yEnd - yStart,
                figures.stream().filter(figure -> selectFilter(figure, xStart, yStart, xEnd, yEnd)).collect(Collectors.toList()));
    }

    private boolean selectFilter(Figure figure, int xStart, int yStart, int xEnd, int yEnd) {

        return ((figure.getX() > xStart) && (figure.getX() + figure.getWidth() < xEnd)
                    && (figure.getY() > yStart) && (figure.getY() + figure.getHeight() < yEnd));
    }
}
