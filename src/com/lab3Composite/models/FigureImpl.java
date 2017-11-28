package com.lab3Composite.models;


import com.lab3Composite.models.parameters.Color;

/**
 * Implementation of Figure interface
 *
 * @see Figure
 */
public abstract class FigureImpl implements Figure {

    private static int lastId = 0;

    protected int x;
    protected int y;
    protected int height;
    protected int width;
    protected int id;
    protected Color color;

    public FigureImpl(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public FigureImpl(int x, int y, int height, int width, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void focus() {
        System.out.println("Focus called on class: " + this.getClass().getName());
    }
}
