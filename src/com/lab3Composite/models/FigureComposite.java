package com.lab3Composite.models;

import com.lab3Composite.models.parameters.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Realisation of composite pattern based on FigureImpl class
 * Contains list of figures
 *
 * @see FigureImpl
 */
public class FigureComposite extends FigureImpl {

    protected List<Figure> figures;

    public FigureComposite(int x, int y, int height, int width, Color color) {
        super(x, y, height, width, color);
    }


    public FigureComposite(int x, int y, int height, int width) {
        super(x, y, height, width);
        this.figures = new ArrayList<>();
    }

    public FigureComposite(int x, int y, int height, int width, List<Figure> figures) {
        super(x, y, height, width);
        this.figures = figures;
    }

    @Override
    public void move(int x, int y) {
        System.out.println(String.format("Figure composite moved! (%d, %d)", x, y));

        figures.forEach(figure -> figure.moveByDelta(-this.x + x, -this.y + y));

        this.x = x;
        this.y = y;
    }

    @Override
    public void moveByDelta(int deltaX, int deltaY) {
        System.out.println(String.format("Figure composite moved by delta! (%d, %d)", deltaX, deltaY));

        figures.forEach(figure -> figure.moveByDelta(deltaX, deltaY));

        x += deltaX;
        y += deltaY;
    }

    @Override
    public void resize(int height, int width) {
        System.out.println(String.format("Figure composite resized! (%d, %d)", height, width));

        figures.forEach(figure -> figure.resizeByDelta(-this.height + height, -this.width + width));

        this.height = height;
        this.width = width;
    }

    @Override
    public void resizeByDelta(int heightDelta, int widthDelta) {
        System.out.println(String.format("Figure composite resized by delta! (%d, %d)", heightDelta, widthDelta));

        figures.forEach(figure -> figure.resizeByDelta(heightDelta, widthDelta));

        this.height += heightDelta;
        this.width += widthDelta;
    }

    @Override
    public void changeColor(int r, int g, int b, double a) {
        this.color = new Color(r, g, b, a);
    }

    @Override
    public void changeColor(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }

    @Override
    public void changeColor(Color newColor) {
        this.color = newColor;
    }

    @Override
    public void draw() {
        System.out.println("Started drawing inner figures of composite");

        figures.forEach(figure -> figure.draw());
    }

    @Override
    public void focus() {
        System.out.println("Focus on composite");

        figures.forEach(figure -> figure.focus());
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
