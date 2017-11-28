package com.lab4Adapter.libs;


/**
 * Just simple placeholder of any GUI lib
 */
public class AdapteePlaceholder {

    /**
     * Draw button on form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     * @param endX x-coordinate of bottom right corner
     * @param endY y-coordinate of bottom right corner
     * @param text text of button
     */
    public void drawButton(int startX, int startY, int endX, int endY, String text) {
        System.out.println(String.format("Button draw on coordinates (%d, %d) - (%d, %d) with text %s",
                startX, startY, endX, endY, text));
    }


    /**
     * Draw child window on form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     * @param endX x-coordinate of bottom right corner
     * @param endY y-coordinate of bottom right corner
     */
    public void drawWindow(int startX, int startY, int endX, int endY) {
        System.out.println(String.format("TextArea draw on coordinates (%d, %d) - (%d, %d)",
                startX, startY, endX, endY));
    }


    /**
     * Draw input form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     */
    public void drawInput(int startX, int startY) {
        System.out.println(String.format("Input draw on coordinates (%d, %d)",
                startX, startY));
    }
}
