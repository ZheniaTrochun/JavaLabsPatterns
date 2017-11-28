package com.lab4Adapter.libs;

import com.lab4Adapter.model.Button;
import com.lab4Adapter.model.Input;
import com.lab4Adapter.model.TextArea;

/**
 * Adapter pattern realisation for adaptind QT class
 * to GuiLibTargetInterface
 *
 * @see com.lab4Adapter.libs.GuiLibTargetInterface
 * @see com.lab4Adapter.libs.AdapteePlaceholder
 */
public class LibAdapter implements GuiLibTargetInterface {

    private AdapteePlaceholder adaptee;

    public LibAdapter(AdapteePlaceholder adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void drawButton(Button button) {
        adaptee.drawButton(button.getStartX(), button.getStartY(),
                button.getEndX(), button.getEndY(), button.getText());
    }

    @Override
    public void drawWindow(TextArea textArea) {
        adaptee.drawWindow(textArea.getStartX(), textArea.getStartY(),
                textArea.getEndX(), textArea.getEndY());
    }

    @Override
    public void drawInput(Input input) {
        adaptee.drawInput(input.getStartX(), input.getStartY());
    }
}
