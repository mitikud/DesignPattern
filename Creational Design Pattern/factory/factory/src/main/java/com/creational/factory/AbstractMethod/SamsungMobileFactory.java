package com.creational.factory.AbstractMethod;

public class SamsungMobileFactory extends MobileFactory {
    Samsung createSamsungMobile(){
        return new Samsung();
    }
}
