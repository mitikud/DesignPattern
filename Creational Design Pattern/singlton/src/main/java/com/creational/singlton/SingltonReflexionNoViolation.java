package com.creational.singlton;

import java.lang.reflect.Constructor;


// Out put
//============================

//creating instance.....
//        Hashcode of Object s1: 214126413
//        Hashcode of Object s2: 214126413
//        creating instance.....
//        Exception in thread "main" java.lang.reflect.InvocationTargetException
//        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:74)
//        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)
//        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)
//        at com.creational.singlton.SingltonReflexionNoViolation.main(SingltonReflexionNoViolation.java:32)
//        Caused by: java.lang.RuntimeException: Can't create instance. Please use getInsance() to create it.
//        at com.creational.singlton.SingltonReflexionNoViolation.<init>(SingltonReflexionNoViolation.java:14)
//        at java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)
//        ... 3 more

public class SingltonReflexionNoViolation {

    public static SingltonReflexionNoViolation instance= new SingltonReflexionNoViolation();

    private SingltonReflexionNoViolation() {
        System.out.println("creating instance.....");

        //Avoid singlton Reflextion violation
        if(instance != null) {
            throw new RuntimeException("Can't create instance. Please use getInsance() to create it.");
        }

    }

    public static SingltonReflexionNoViolation getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception{
        SingltonReflexionNoViolation s1 = SingltonReflexionNoViolation.getInstance();
        SingltonReflexionNoViolation s2 = SingltonReflexionNoViolation.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

       Class clazz = Class.forName("com.creational.singlton.SingltonReflexionNoViolation");
        Constructor<SingltonReflexionNoViolation> ctr= clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        SingltonReflexionNoViolation s3 = ctr.newInstance();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
