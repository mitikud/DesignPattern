package com.creational.factory.AbstractMethod;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MobileFactory factory= new MobileFactory();
        LenovoMobileFactory lmf= (LenovoMobileFactory)factory.createMobile("lenf");
        Lenovo ln= (Lenovo)lmf.createLenovoMobile();
        ln.pictureCapacity();
    }
}
