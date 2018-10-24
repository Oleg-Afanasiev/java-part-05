package com.academy.telesens.lesson08.components;

public class Button extends Component {
    @Override
    public void draw() {
        System.out.println("Button");
    }

    public void click() {
        System.out.println("Click");
    }
}
