package com.sheqet.observer;

public class HeatAlert implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (temperature > 35) {
            System.out.println("Heat Alert: Current Temperature: " + temperature + "°C");
        }
    }
}
