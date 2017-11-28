package com.lab4Adapter.model;


public class TextArea extends Element {

    private int endX;
    private int endY;
    private String text;


    public TextArea(int startX, int startY, int endX, int endY, String text) {
        super(startX, startY);

        this.endX = endX;
        this.endY = endY;
        this.text = text;

        this.type = "TEXTAREA";
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
