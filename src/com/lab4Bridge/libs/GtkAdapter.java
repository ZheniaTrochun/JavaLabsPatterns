package com.lab4Bridge.libs;

public class GtkAdapter implements GuiLib {

    private final GTK gtk;

    public GtkAdapter(GTK gtk) {
        this.gtk = gtk;
    }
    /**
     * Draw button on form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     * @param endX   x-coordinate of bottom right corner
     * @param endY   y-coordinate of bottom right corner
     * @param text   text of button
     */
    @Override
    public void drawButton(int startX, int startY, int endX, int endY, String text) {
        gtk.drawGtkButton(startX, startY, endX, endY, text);
    }

    @Override
    public void writeLineOfText(int startX, int startY, String text) {
        gtk.writeText(startX, startY, text);
    }

    @Override
    public void drawLine(int startX, int startY, int endX, int endY) {
        gtk.drawLine(startX, startY, endX, endY);
    }

    @Override
    public void drawDote(int x, int y) {
        gtk.drawDote(x, y);
    }


    /**
     * Draw input form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     */
    @Override
    public void drawInput(int startX, int startY) {
        gtk.drawStandartGtkInput(startX, startY);
    }
}
