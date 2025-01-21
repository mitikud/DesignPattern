package com.structuralDP.adapter.example;

public class AdapterPatternTest {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.getAppleColor("green");

        Orange orange = new Orange();
        AppleAdapter adapter = new AppleAdapter(orange);
        adapter.getAppleColor("red");
    }
}
