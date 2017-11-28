package com.lab3.models.decorators;

import com.lab3.models.Figure;

/**
 * Created by zhenia on 11.10.17.
 */
public class MoveDecorator extends AbstractFigureDecorator {
    public MoveDecorator(Figure figure) {
        super(figure);
    }

    @Override
    public void focus() {
        changeCursor();
        figure.focus();
    }

    private void changeCursor() {
        System.out.println("Cursor changed to \"movecursor\" in class: " + this.getClass().getName());
    }
}
