package com.lab3.models.decorators;

import com.lab3.models.Figure;

/**
 * Created by zhenia on 11.10.17.
 */
public class ResizeDecorator extends AbstractFigureDecorator {
    public ResizeDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void focus() {
        drawResizeBorder();
        figure.focus();
    }

    private void drawResizeBorder() {
        System.out.println("Resize border drawn on class: " + this.getClass().getName());
    }
}
