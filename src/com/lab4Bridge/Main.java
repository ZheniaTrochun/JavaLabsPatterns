package com.lab4Bridge;

import com.lab4Bridge.libs.*;
import com.lab4Bridge.model.Button;
import com.lab4Bridge.model.Input;
import com.lab4Bridge.model.TextArea;


public class Main {
    public static void main(String[] args) {

        GuiLib gtk = new GtkAdapter(new GTK());
        GuiLib qt = new QtAdapter(new QT());

        Button button = new Button(0, 0, 0, 0, "button", gtk);
        Button button1 = new Button(0, 0, 0, 0, "button", qt);

        TextArea textArea = new TextArea(   0, 0, 34, 34, "button", gtk);
        TextArea textArea1 = new TextArea(0, 0, 34, 34, "button", qt);

        Input input = new Input(0, 0, gtk);
        Input input1 = new Input(0, 0, qt);

//        button.draw();
//        button1.draw();

        textArea.draw();

        System.out.println();

        textArea1.draw();


//        input.draw();
//        input1.draw();
    }
}
