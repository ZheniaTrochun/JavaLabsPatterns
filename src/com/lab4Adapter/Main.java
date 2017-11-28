package com.lab4Adapter;

import com.lab4Adapter.controller.Program;
import com.lab4Adapter.model.Button;
import com.lab4Adapter.model.Input;
import com.lab4Adapter.model.TextArea;


public class Main {
    public static void main(String[] args) {
        Program program = new Program();

        program.add(new Button(0, 0, 1, 1, "Test"));
        program.add(new TextArea(0, 0, 1, 1, "text"));
        program.add(new Input(0, 0));
        program.add(new Button(1, 1, 2, 2, "Test2"));

        program.init();
    }
}
