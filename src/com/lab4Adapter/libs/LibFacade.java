package com.lab4Adapter.libs;

import com.lab4Adapter.model.Element;


/**
 * Facade for GuiLidTargetInterface
 * simplifies method draw calling
 *
 * @author zhenia
 * @see com.lab4Adapter.libs.GuiLibTargetInterface
 */
public interface LibFacade {
    void draw(Element element);
}
