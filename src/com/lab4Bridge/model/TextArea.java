package com.lab4Bridge.model;


import com.lab4Bridge.libs.GuiLib;


/**
 * Simple textarea gui element
 */
public class TextArea extends Element {

    private int endX;
    private int endY;
    private String text;


    public TextArea(int startX, int startY, int endX, int endY, String text, GuiLib guiLib) {
        super(startX, startY, guiLib);

        this.endX = endX;
        this.endY = endY;
        this.text = text;

        this.type = "TEXTAREA";
    }

    public TextArea(int startX, int startY, int endX, int endY, int textSize, String text, GuiLib guiLib) {
        super(startX, startY, textSize, guiLib);

        this.endX = endX;
        this.endY = endY;
        this.text = text;

        this.type = "TEXTAREA";
    }

    @Override
    public void draw() {

        String[] lines = text.split("\\n");

        for (int i = 0; i < lines.length; i++) {
            guiLib.writeLineOfText(startX + 10, startY + i * textSize + 10, lines[i]);
        }

        guiLib.drawLine(startX, startY, startX, endY);
        guiLib.drawLine(startX, endY, endX, endY);
        guiLib.drawLine(startX, startY, endX, startY);
        guiLib.drawLine(endX, startY, endX, endY);

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
