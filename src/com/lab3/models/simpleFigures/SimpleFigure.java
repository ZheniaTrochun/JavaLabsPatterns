package com.lab3.models.simpleFigures;

import com.lab3.models.parameters.Color;
import com.lab3.models.FigureImpl;

/**
 * Abstract class for simple figures
 *
 * @see com.lab3.models.FigureImpl
 */
public abstract class SimpleFigure extends FigureImpl {
    public SimpleFigure(int x, int y, int height, int width, Color color) {
        super(x, y, height, width, color);
    }

    public SimpleFigure(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public void move(int x, int y) {
        System.out.println(String.format("Figure %s moved! (%d, %d)", this.getClass().getName(), x, y));

        this.x = x;
        this.y = y;
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
    public void moveByDelta(int deltaX, int deltaY) {
        System.out.println(String.format("Figure %s moved by delta! (%d, %d)", this.getClass().getName(), deltaX, deltaY));
        x += deltaX;
        y += deltaY;
    }
    /**
     * Change size
     *
     * @param height new height of figure
     * @param width  new width of figure
     */
    @Override
    public void resize(int height, int width) {
        System.out.println(String.format("Figure %s resized! (%d, %d)", this.getClass().getName(), width, height));

        this.height = height;
        this.width = width;
    }

    /**
     * Change size by delta
     *
     * @param heightDelta change of height
     * @param widthDelta  change of width
     */
    @Override
    public void resizeByDelta(int heightDelta, int widthDelta) {
        System.out.println(String.format("Figure %s resized by delta! (%d, %d)", this.getClass().getName(), widthDelta, heightDelta));

        this.width += widthDelta;
        this.height += heightDelta;
    }
}
