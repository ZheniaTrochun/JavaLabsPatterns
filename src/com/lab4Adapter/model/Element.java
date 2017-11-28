package com.lab4Adapter.model;

/**
 * Abstract model of GuiElement
 */
public abstract class Element implements GuiElement {

    private static int lastId = 0;

    protected int id;
    protected int startX;
    protected int startY;

    protected String type;

    public Element(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
        this.id = ++lastId;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
