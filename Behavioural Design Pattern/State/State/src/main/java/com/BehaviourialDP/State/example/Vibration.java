package com.BehaviourialDP.State.example;

public class Vibration implements MobileState {

    @Override
    public void getState() {
        System.out.println("Mobile is in vibration state");
    }
}
