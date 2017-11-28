package com.lab4Bridge.libs;

public class QtAdapter implements GuiLib {

    private final QT qt;

    public QtAdapter(QT qt) {
        this.qt = qt;
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
        qt.drawQtButton(startX, startY, endX, endY, text);
    }


    @Override
    public void writeLineOfText(int startX, int startY, String text) {
        qt.writeText(startX, startY, text);
    }

    @Override
    public void drawLine(int startX, int startY, int endX, int endY) {
        qt.drawLine(startX, startY, endX, endY);
    }

    @Override
    public void drawDote(int x, int y) {
        qt.drawDote(x, y);
    }


    /**
     * Draw input form
     *
     * @param startX x-coordinate of top left corner
     * @param startY y-coordinate of top left corner
     */
    @Override
    public void drawInput(int startX, int startY) {
        qt.drawQtInput(startX, startY);
    }
}
