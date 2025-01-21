package com.structuralDP.decorator.example;

public class DecoratorPatternTest {

    public static void main(String[] args) {

        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        System.out.println(icecream.makeIcecream());
    }
}
