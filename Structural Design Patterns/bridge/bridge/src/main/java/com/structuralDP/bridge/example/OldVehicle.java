package com.structuralDP.bridge.example;

/**
 * Concrete implementation 2 for Bridge pattern
 * */
public class OldVehicle implements VehicleType{

    @Override
    public void book() {
        System.out.println(" : Old Vehicle");
    }
}
