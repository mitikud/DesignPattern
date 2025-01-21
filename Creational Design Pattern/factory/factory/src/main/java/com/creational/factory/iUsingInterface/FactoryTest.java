package com.creational.factory.iUsingInterface;

public class FactoryTest {

    //Out put

//    Lenovo created
//    Lenovo battery power starts from 2500 MAh
//    Samsung created
//    Samsung Cost starts from 6000

    public static void main(String[] args) {
        MobileFactory factory= new MobileFactory();

        Lenovo len = (Lenovo)factory.createMobile("len");
        len.batteryPower();

        Samsung sam= (Samsung)factory.createMobile("sam");
        sam.cost();
    }
}
