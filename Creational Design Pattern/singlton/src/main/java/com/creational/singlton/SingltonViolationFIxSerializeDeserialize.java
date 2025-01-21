package com.creational.singlton;

import java.io.*;

//Output
//creating instance.....
//        Hashcode of Object s1: 214126413
//        Hashcode of Object s2: 214126413
//        Applying readResolve()......
//        Hashcode of Object s3: 214126413
public class SingltonViolationFIxSerializeDeserialize implements Serializable {

    public static SingltonViolationFIxSerializeDeserialize instance= new SingltonViolationFIxSerializeDeserialize();

    private SingltonViolationFIxSerializeDeserialize() {
        System.out.println("creating instance.....");
    }

    public static SingltonViolationFIxSerializeDeserialize getInstance() {
        return instance;
    }
    
    // Fix the violation

    private Object readResolve() {
        System.out.println("Applying readResolve()......");
        return SingltonViolationFIxSerializeDeserialize.getInstance();
    }

    public static void main(String[] args) throws Exception{
        SingltonViolationFIxSerializeDeserialize s1 = SingltonViolationFIxSerializeDeserialize.getInstance();
        SingltonViolationFIxSerializeDeserialize s2 = SingltonViolationFIxSerializeDeserialize.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/s2.ser"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/tmp/s2.ser"));
        SingltonViolationFIxSerializeDeserialize s3= (SingltonViolationFIxSerializeDeserialize)ois.readObject();

        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
