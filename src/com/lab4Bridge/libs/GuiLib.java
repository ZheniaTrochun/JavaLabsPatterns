package com.lab4Bridge.libs;


/**
 * Bridge implementer interface
 */
public interface GuiLib {
    /**
     * Draw button on form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     * @param endX x-coordinate of bottom right corner
     * @param endY y-coordinate of bottom right corner
     * @param text text of button
     */
    void drawButton(int startX, int startY, int endX, int endY, String text);


//    /**
//     * Draw child window on form
//     *
//     * @param startX x-coordinate of top left corner
//     * @param startY y-coordinate of top left corner
//     * @param endX x-coordinate of bottom right corner
//     * @param endY y-coordinate of bottom right corner
//     * @param text text of textarea
//     */
//    void drawTextarea(int startX, int startY, int endX, int endY, String text);

    void writeLineOfText(int startX, int startY, String text);

    void drawLine(int startX, int startY, int endX, int endY);

    void drawDote(int x, int y);

    /**
     * Draw input form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     */
    void drawInput(int startX, int startY);
}
