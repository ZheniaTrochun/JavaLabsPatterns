package com.lab4Bridge.libs;

/**
 * Just simple placeholder of gtk lib
 */
public class GTK {

    /**
     * Draw button on form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     * @param endX x-coordinate of bottom right corner
     * @param endY y-coordinate of bottom right corner
     * @param text text of button
     */
    public void drawGtkButton(int startX, int startY, int endX, int endY, String text) {
        System.out.println(String.format("Button draw on coordinates (%d, %d) - (%d, %d) with text %s by GTK",
                startX, startY, endX, endY, text));
    }



    /**
     * Draw input form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     */
    public void drawStandartGtkInput(int startX, int startY) {
        System.out.println(String.format("Input draw on coordinates (%d, %d) by GTK",
                startX, startY));
    }

    public void writeText(int startX, int startY, String text) {
        System.out.println(String.format("Text draw on coordinates (%d, %d) %s by GTK",
                startX, startY, text));
    }

    public void drawLine(int startX, int startY, int endX, int endY) {
        System.out.println(String.format("line draw on coordinates (%d, %d) - (%d, %d) by GTK",
                startX, startY, endX, endY));
    }

    public void drawDote(int x, int y) {
        System.out.println(String.format("Dote draw on coordinates (%d, %d) by GTK", x, y));
    }
}
