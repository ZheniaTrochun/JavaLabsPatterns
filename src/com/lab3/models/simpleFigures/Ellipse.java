package com.lab3.models.simpleFigures;

import com.lab3.models.parameters.Color;

/**
 * Class, which draws ellipse
 */
public class Ellipse extends SimpleFigure {

    public Ellipse(int x, int y, int height, int width, Color color) {
        super(x, y, height, width, color);
    }

    public Ellipse(int x, int y, int height, int width) {
        super(x, y, height, width);
    }


    /**
     * Draw ellipse on start coordinates
     *
     * But it`s just placeholder
     */
    @Override
    public void draw() {
        System.out.println(String.format("Method draw called! on class Ellipse on coordinates: (%d, %d)", x, y));
    }
}
