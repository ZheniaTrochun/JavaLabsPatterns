package com.lab3.models.parameters;

/**
 * Simple container for color
 */
public class Color {
    public int r;
    public int g;
    public int b;
    public double a;

    public Color(int r, int g, int b, double a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = 0;
    }
}
