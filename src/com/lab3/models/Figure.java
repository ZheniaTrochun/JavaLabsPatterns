package com.lab3.models;


import com.lab3.models.parameters.Color;

/**
 * Base interface for all figures
 *
 * @author zhenia
 */
public interface Figure {

    int getX();
    int getY();
    int getHeight();
    int getWidth();
    int getId();
    Color getColor();

    /**
     * Move figure to cpecified coordinates
     *
     * @param x x-coordinate
     * @param y y-coordinate
     */
    void move(int x, int y);

    /**
     * Move figure by deltas
     *
     * @param deltaX change of x-coordinate
     * @param deltaY change of y-coordinate
     */
    void moveByDelta(int deltaX, int deltaY);


    /**
     * Change size
     *
     * @param height new height of figure
     * @param width new width of figure
     */
    void resize(int height, int width);

    /**
     * Change size by delta
     *
     * @param heightDelta change of height
     * @param widthDelta change of width
     */
    void resizeByDelta(int heightDelta, int widthDelta);


    /**
     * Recolor figure
     *
     * @params r, g, b, alpha of new color
     */
    void changeColor(int r, int g, int b, double a);

    /**
     * Recolor figure
     *
     * @params r, g, b of new color
     */
    void changeColor(int r, int g, int b);

    /**
     * Recolor figure
     *
     * @param newColor new color of figure
     */
    void changeColor(Color newColor);

    /**
     * Draw figure on picture
     */
    void draw();

    void focus();
}
