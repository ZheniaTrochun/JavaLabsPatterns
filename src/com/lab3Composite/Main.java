package com.lab3Composite;

import com.lab3Composite.models.Figure;
import com.lab3Composite.models.FigureComposite;
import com.lab3Composite.models.decorators.MoveDecorator;
import com.lab3Composite.models.decorators.ResizeDecorator;
import com.lab3Composite.models.simpleFigures.Circle;
import com.lab3Composite.models.simpleFigures.Ellipse;
import com.lab3Composite.models.simpleFigures.Rectangle;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Picture pic = new Picture();
//
//        pic.add(new Rectangle(0, 0, 1));
//        pic.add(new Circle(0, 0, 1));
//        pic.add(new Ellipse(0, 0, 1));


//        pic.add(composite);

//        pic.drawAll();

        Figure rect = new Rectangle(0, 0, 1, 2);
        Figure circle = new Circle(0, 0, 1, 2);
        Figure ellipse = new Ellipse(0, 0, 1, 2);

        Figure compos = new FigureComposite(0, 0, 10, 10, Arrays.asList(rect, circle, ellipse));


        rect = new ResizeDecorator(new MoveDecorator(rect));
        compos = new ResizeDecorator(new MoveDecorator(compos));

        rect.focus();
        compos.focus();
    }
}
