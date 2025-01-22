package com.BehaviourialDP.State.example;

public class Silent implements MobileState {

    @Override
    public void getState() {
        System.out.println("Mobile is in silent state");
    }
}