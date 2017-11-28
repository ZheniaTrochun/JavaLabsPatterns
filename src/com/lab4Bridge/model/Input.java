package com.lab4Bridge.model;

import com.lab4Bridge.libs.GuiLib;

/**
 * Default input gui element
 */
public class Input extends Element {

    private int height;
    private int width;

    public Input(int startX, int startY, GuiLib guiLib) {
        super(startX, startY, guiLib);

        height = 20;
        width = 100;

        this.type = "INPUT";
    }

    public Input(int startX, int startY, int width, int height, GuiLib guiLib) {
        super(startX, startY, guiLib);

        this.width = width;
        this. height = height;

        this.type = "INPUT";
    }

    @Override
    public void draw() {
        guiLib.drawLine(startX, startY, startX, startY + width);
        guiLib.drawLine(startX, startY + width, startX + height, startY + width);
        guiLib.drawLine(startX, startY, startX + height, startY);
        guiLib.drawLine(startX  + height, startY, startX + height, startY + width);


    }
}
