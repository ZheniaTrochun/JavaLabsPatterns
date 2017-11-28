package com.lab4Adapter.controller;


import com.lab4Adapter.libs.LibFacade;
import com.lab4Adapter.libs.LibFacadeImpl;
import com.lab4Adapter.model.Element;

import java.util.ArrayList;
import java.util.List;


/**
 * Simple controller with only basic functionality like add and show
 *
 * @author zhenia
 */
public class Program {
    private LibFacade lib;

    private List<Element> elements;

    public Program(LibFacade libFacade, List<Element> elements) {
        this.lib = libFacade;
        this.elements = elements;
    }

    public Program() {
        elements = new ArrayList<>();
        lib = new LibFacadeImpl();
    }


    /**
     * Draw all elements on form
     */
    public void init() {
        elements.forEach(element -> lib.draw(element));
    }


    /**
     * Add new element to form
     *
     * @param element element for adding
     */
    public void add(Element element) {
        elements.add(element);
    }
}
