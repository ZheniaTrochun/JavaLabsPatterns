package com.lab3;

import com.lab3.models.Figure;
import com.lab3.models.decorators.MoveDecorator;
import com.lab3.models.decorators.ResizeDecorator;
import com.lab3.models.simpleFigures.Circle;
import com.lab3.models.simpleFigures.Ellipse;
import com.lab3.models.simpleFigures.Rectangle;



public class Main {
    public static void main(String[] args) {

        Figure rect = new Rectangle(0, 0, 1, 2);
        Figure circle = new Circle(0, 0, 1, 2);
        Figure ellipse = new Ellipse(0, 0, 1, 2);


        rect = new ResizeDecorator(new MoveDecorator(rect));

        rect.focus();
    }
}
