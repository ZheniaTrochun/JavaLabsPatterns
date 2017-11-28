package com.lab4Bridge.model;

import com.lab4Bridge.libs.GuiLib;

/**
 * Abstract model of GuiElement
 */
public abstract class Element {

    private static int lastId = 0;

    protected int id;
    protected int startX;
    protected int startY;
    protected int textSize;

    protected String type;

    protected GuiLib guiLib;

    public Element(int startX, int startY, int textSize, GuiLib guiLib) {
        this.startX = startX;
        this.startY = startY;
        this.textSize = textSize;
        this.guiLib = guiLib;
        this.id = ++lastId;
    }

    public Element(int startX, int startY, GuiLib guiLib) {
        this.startX = startX;
        this.startY = startY;
        this.textSize = 14;
        this.guiLib = guiLib;
        this.id = ++lastId;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public abstract void draw();

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

    public GuiLib getGuiLib() {
        return guiLib;
    }

    public void setGuiLib(GuiLib guiLib) {
        this.guiLib = guiLib;
    }

    public String getType() {
        return type;
    }
}
