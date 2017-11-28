package com.lab3.controller;


import com.lab3.models.Figure;

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

    /**
     * Add new figure to picture
     *
     * @param figure new figure
     * @return is adding done wright
     */
    public boolean add(Figure figure) {
        return figures.add(figure);
    }

    /**
     * Draw picture
     */
    public void drawAll() {
        figures.forEach(figure -> figure.draw());
    }

    /**
     * Select figures
     *
     * @param xStart start x-coordinate
     * @param yStart start y-coordinate
     * @param xEnd end x-coordinate
     * @param yEnd end y-coordinate
     * @return list of figures
     */
    public List<Figure> select(int xStart, int yStart, int xEnd, int yEnd) {
        return figures.stream().filter(figure -> selectFilter(figure, xStart, yStart, xEnd, yEnd)).collect(Collectors.toList());
    }

    /**
     * Checker of figures
     *
     * @param figure figure to check
     * @param xStart start x-coordinate
     * @param yStart start y-coordinate
     * @param xEnd end x-coordinate
     * @param yEnd end y-coordinate
     * @return is figure in select area
     */
    private boolean selectFilter(Figure figure, int xStart, int yStart, int xEnd, int yEnd) {

        return ((figure.getX() > xStart) && (figure.getX() + figure.getWidth() < xEnd)
                    && (figure.getY() > yStart) && (figure.getY() + figure.getHeight() < yEnd));
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
