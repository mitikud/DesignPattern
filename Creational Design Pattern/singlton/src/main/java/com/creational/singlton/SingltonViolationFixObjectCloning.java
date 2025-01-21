package com.creational.singlton;

//Output
//        creating instance.....
//        Hashcode of Object s1: 366712642
//        Hashcode of Object s2: 366712642
//        Hashcode of Object s3: 1829164700
public class SingltonViolationFixObjectCloning implements Cloneable{

    public static SingltonViolationFixObjectCloning instance= new SingltonViolationFixObjectCloning();

    private SingltonViolationFixObjectCloning() {
        System.out.println("creating instance.....");
    }

    public static SingltonViolationFixObjectCloning getInstance() {
        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {

        // Fix Violation
        if(instance != null) {
            throw new CloneNotSupportedException("Can't create instance. Please use getInsance() to create it.");
        }
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        SingltonViolationFixObjectCloning s1 = SingltonViolationFixObjectCloning.getInstance();
        SingltonViolationFixObjectCloning s2 = SingltonViolationFixObjectCloning.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        SingltonViolationFixObjectCloning s3 = (SingltonViolationFixObjectCloning)s2.clone();
        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
