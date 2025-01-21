package com.structuralDP.decorator.example;

public class IcecreamDecorator implements Icecream{

    protected Icecream specialIcecream;

    public IcecreamDecorator(Icecream specialIcecream){
        this.specialIcecream = specialIcecream;
    }

    @Override
    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }
}
