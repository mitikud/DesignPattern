package com.structuralDP.bridge.example;

/**
 * Concrete implementation 1 for Bridge pattern
 * */
public class NewVehicle implements VehicleType{

    @Override
    public void book() {
        System.out.print(" : New Vehicle");
    }
}
