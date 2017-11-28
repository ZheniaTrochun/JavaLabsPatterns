package com.lab4Bridge.model;


import com.lab4Bridge.libs.GuiLib;

/**
 * Button gui element
 */
public class Button extends Element {

    private int endX;
    private int endY;
    private String text;

    public Button(int startX, int startY, int endX, int endY, int textSize, String text, GuiLib guiLib) {
        super(startX, startY, textSize, guiLib);

        this.endX = endX;
        this.endY = endY;
        this.text = text;

        this.type = "BUTTON";
    }


    public Button(int startX, int startY, int endX, int endY, String text, GuiLib guiLib) {
        super(startX, startY, guiLib);

        this.endX = endX;
        this.endY = endY;
        this.text = text;

        this.type = "BUTTON";
    }

    @Override
    public void draw() {

        guiLib.drawLine(startX, startY, startX, endY);
        guiLib.drawLine(startX, endY, endX, endY);
        guiLib.drawLine(startX, startY, endX, startY);
        guiLib.drawLine(endX, startY, endX, endY);

        guiLib.writeLineOfText(startX/2 - textSize/2, startY + 10, text);
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
