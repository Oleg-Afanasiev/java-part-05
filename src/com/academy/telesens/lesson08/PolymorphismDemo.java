package com.academy.telesens.lesson08;

import com.academy.telesens.lesson08.components.Button;
import com.academy.telesens.lesson08.components.CheckBox;
import com.academy.telesens.lesson08.components.Component;
import com.academy.telesens.lesson08.components.Label;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Component component = new Component();
        component.draw();

        Component component2 = new Button();
        component2.draw();
        component2 = new CheckBox();
        component2.draw();
        ((CheckBox)component2).check();

        Component[] components = {
                new Component(),
                new Button(),
                new Button(),
                new CheckBox(),
                new Button(),
                new Label(),
                };

        System.out.println("************");
        for (Component element: components) {
            element.draw();
        }
    }
}
