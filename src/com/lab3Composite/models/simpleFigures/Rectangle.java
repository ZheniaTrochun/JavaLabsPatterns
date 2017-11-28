package com.lab3Composite.models.simpleFigures;

import com.lab3Composite.models.parameters.Color;

/**
 * Class, which draws rectangle
 */
public class Rectangle extends SimpleFigure {

    public Rectangle(int x, int y, int height, int width, Color color) {
        super(x, y, height, width, color);
    }

    public Rectangle(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    /**
     * Draw rectangle on start coordinates
     *
     * But it`s just placeholder
     */
    @Override
    public void draw() {
        System.out.println(String.format("Method draw called! on class Rectangle on coordinates: (%d, %d)", x, y));
    }


}
