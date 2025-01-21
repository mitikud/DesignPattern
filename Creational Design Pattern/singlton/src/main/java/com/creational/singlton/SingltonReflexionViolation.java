package com.creational.singlton;

import java.lang.reflect.Constructor;

//out put

//creating instance.....
//        Hashcode of Object s1: 366712642
//        Hashcode of Object s2: 366712642
//        creating instance.....
//        Hashcode of Object s3: 1829164700
public class SingltonReflexionViolation {

    public static SingltonReflexionViolation instance= new SingltonReflexionViolation();

    private SingltonReflexionViolation() {
        System.out.println("creating instance.....");

    }

    public static SingltonReflexionViolation getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception{
        SingltonReflexionViolation s1 = SingltonReflexionViolation.getInstance();
        SingltonReflexionViolation s2 = SingltonReflexionViolation.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

       Class clazz = Class.forName("com.creational.singlton.SingltonReflexionViolation");
        Constructor<SingltonReflexionViolation> ctr= clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        SingltonReflexionViolation s3 = ctr.newInstance();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
