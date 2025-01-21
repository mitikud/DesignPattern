package com.creational.singlton;

//Output
//        creating instance.....
//        Hashcode of Object s1: 366712642
//        Hashcode of Object s2: 366712642
//        Hashcode of Object s3: 1829164700
public class SingltonViolationObjectCloning implements Cloneable{

    public static SingltonViolationObjectCloning instance= new SingltonViolationObjectCloning();

    private SingltonViolationObjectCloning() {
        System.out.println("creating instance.....");
    }

    public static SingltonViolationObjectCloning getInstance() {
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        SingltonViolationObjectCloning s1 = SingltonViolationObjectCloning.getInstance();
        SingltonViolationObjectCloning s2 = SingltonViolationObjectCloning.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        SingltonViolationObjectCloning s3 = (SingltonViolationObjectCloning)s2.clone();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
