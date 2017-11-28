package com.lab3Composite.models.decorators;

import com.lab3Composite.models.Figure;
import com.lab3Composite.models.parameters.Color;

/**
 * Created by zhenia on 11.10.17.
 */
public abstract class AbstractFigureDecorator implements Figure {

    protected Figure figure;

    public AbstractFigureDecorator(Figure figure) {
        this.figure = figure;
    }

    @Override
    public int getX() {
        return figure.getX();
    }

    @Override
    public int getY() {
        return figure.getY();
    }

    @Override
    public int getHeight() {
        return figure.getHeight();
    }

    @Override
    public int getWidth() {
        return figure.getWidth();
    }

    @Override
    public int getId() {
        return figure.getId();
    }

    @Override
    public Color getColor() {
        return figure.getColor();
    }

    /**
     * Move figure to cpecified coordinates
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    @Override
    public void move(int x, int y) {
        figure.move(x, y);
    }

    /**
     * Move figure by deltas
     *
     * @param deltaX change of x-coordinate
     * @param deltaY change of y-coordinate
     */
    @Override
    public void moveByDelta(int deltaX, int deltaY) {
        figure.moveByDelta(deltaX, deltaY);
    }

    /**
     * Change size
     *
     * @param height new height of figure
     * @param width  new width of figure
     */
    @Override
    public void resize(int height, int width) {
        figure.resize(height, width);
    }

    /**
     * Change size by delta
     *
     * @param heightDelta change of height
     * @param widthDelta  change of width
     */
    @Override
    public void resizeByDelta(int heightDelta, int widthDelta) {
        figure.resizeByDelta(heightDelta, widthDelta);
    }

    /**
     * Recolor figure
     *
     * @param r
     * @param g
     * @param b
     * @param a
     * @params r, g, b, alpha of new color
     */
    @Override
    public void changeColor(int r, int g, int b, double a) {
        figure.changeColor(r, g, b, a);
    }

    /**
     * Recolor figure
     *
     * @param r
     * @param g
     * @param b
     * @params r, g, b of new color
     */
    @Override
    public void changeColor(int r, int g, int b) {
        figure.changeColor(r, g, b);
    }

    /**
     * Recolor figure
     *
     * @param newColor new color of figure
     */
    @Override
    public void changeColor(Color newColor) {
        figure.changeColor(newColor);
    }

    /**
     * Draw figure on picture
     */
    @Override
    public void draw() {
        figure.draw();
    }

    @Override
    public void focus() {
        figure.focus();
    }
}
