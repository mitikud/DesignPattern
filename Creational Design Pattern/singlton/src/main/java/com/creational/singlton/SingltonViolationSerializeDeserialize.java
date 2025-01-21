package com.creational.singlton;

import java.io.*;

//Output
//        creating instance.....
//        Hashcode of Object s1: 366712642
//        Hashcode of Object s2: 366712642
//        Hashcode of Object s3: 1829164700
public class SingltonViolationSerializeDeserialize implements Serializable {

    public static SingltonViolationSerializeDeserialize instance= new SingltonViolationSerializeDeserialize();

    private SingltonViolationSerializeDeserialize() {
        System.out.println("creating instance.....");
    }

    public static SingltonViolationSerializeDeserialize getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception{
        SingltonViolationSerializeDeserialize s1 = SingltonViolationSerializeDeserialize.getInstance();
        SingltonViolationSerializeDeserialize s2 = SingltonViolationSerializeDeserialize.getInstance();
        System.out.println("Hashcode of Object s1: " +s1.hashCode());
        System.out.println("Hashcode of Object s2: " +s2.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/s2.ser"));
        oos.writeObject(s2);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/tmp/s2.ser"));
        SingltonViolationSerializeDeserialize s3= (SingltonViolationSerializeDeserialize)ois.readObject();

        System.out.println("Hashcode of Object s3: " +s3.hashCode());

    }
}
