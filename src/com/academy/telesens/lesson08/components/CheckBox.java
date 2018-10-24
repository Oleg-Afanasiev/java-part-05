package com.academy.telesens.lesson08.components;

public class CheckBox extends Component {
    @Override
    public void draw() {
        System.out.println("CheckBox");
    }

    public void check() {
        System.out.println("Check");
    }
}
