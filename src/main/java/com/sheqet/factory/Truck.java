package com.sheqet.factory;

public class Truck implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}