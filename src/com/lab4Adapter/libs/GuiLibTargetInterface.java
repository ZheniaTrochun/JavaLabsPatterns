package com.lab4Adapter.libs;

import com.lab4Adapter.model.Button;
import com.lab4Adapter.model.Input;
import com.lab4Adapter.model.TextArea;


/**
 * Target interface for all GUI
 */
public interface GuiLibTargetInterface {

    /**
     * Draw button on form
     *
     * @param button button for drawing
     */
    void drawButton(Button button);

    /**
     * Draw modal or child textArea
     *
     * @param textArea child textArea for drawing
     */
    void drawWindow(TextArea textArea);

    /**
     * Draw input form on main form
     *
     * @param input input for drawing
     */
    void drawInput(Input input);
}
