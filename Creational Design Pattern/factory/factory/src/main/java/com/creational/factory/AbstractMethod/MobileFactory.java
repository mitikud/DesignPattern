package com.creational.factory.AbstractMethod;

import com.creational.factory.iUsingInterface.IMobile;
import com.creational.factory.iUsingInterface.Lenovo;
import com.creational.factory.iUsingInterface.Samsung;

public class MobileFactory implements IMobileFactory{
    @Override
    public IMobileFactory createMobile(String type) {

        IMobileFactory mob = null;
        if ("lenf".equalsIgnoreCase(type)){
            mob= new LenovoMobileFactory();
        } else if ("samf".equalsIgnoreCase(type)){
            mob= new SamsungMobileFactory();
        }
        return mob;
    }
}
