package com.lab4Adapter.libs;

import com.lab4Adapter.model.Button;
import com.lab4Adapter.model.Element;
import com.lab4Adapter.model.Input;
import com.lab4Adapter.model.TextArea;


/**
 * Facade implementation
 *
 * @see com.lab4Adapter.libs.LibFacade
 */
public class LibFacadeImpl implements LibFacade {

    private GuiLibTargetInterface adapter;

    public LibFacadeImpl() {
        adapter = new LibAdapter(new AdapteePlaceholder());
    }

    @Override
    public void draw(Element element) {
        String type = element.getType();

        if ("BUTTON".equals(type)) {
            adapter.drawButton((Button) element);
        }

        else if ("WINDOW".equals(type)) {
            adapter.drawWindow((TextArea) element);
        }

        else if ("INPUT".equals(type)) {
            adapter.drawInput((Input) element);
        }
    }
}
