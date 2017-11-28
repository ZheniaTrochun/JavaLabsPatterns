package com.lab3.models.simpleFigures;

import com.lab3.models.parameters.Color;

/**
 * Class, which draws circle
 */
public class Circle extends SimpleFigure {

    public Circle(int x, int y, int height, int width, Color color) {
        super(x, y, height, width, color);
    }

    public Circle(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    /**
     * Draw circle on start coordinates
     *
     * But it`s just placeholder
     */
    @Override
    public void draw() {
        System.out.println(String.format("Method draw called! on class Circle on coordinates: (%d, %d)", x, y));
    }
}
