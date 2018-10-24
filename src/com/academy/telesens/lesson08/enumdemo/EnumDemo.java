package com.academy.telesens.lesson08.enumdemo;

public class EnumDemo {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        System.out.println(season);
        System.out.println(season.next());
    }
}
