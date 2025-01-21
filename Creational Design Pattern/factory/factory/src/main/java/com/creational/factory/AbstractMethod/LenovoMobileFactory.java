package com.creational.factory.AbstractMethod;

public class LenovoMobileFactory extends MobileFactory {
    Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}
