package com.structuralDP.adapter.example;

public class AppleAdapter extends Apple {
    //The purpose of the sample problem is to adapt an orange as an apple.
    private final Orange orange;

    // This is the main logic of Adapter pattern
    public AppleAdapter(Orange orange){
        this.orange = orange;
    }

    public void getColor(String color){
        orange.getOrangeColor(color);
    }
}
