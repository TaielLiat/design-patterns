package com.sheqet.observer;

public class DisplayScreen implements Observer {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Display: Temp = " + temperature + "°C, Humidity = " + humidity + "%, Pressure = " + pressure + " hPa");

    }
}
