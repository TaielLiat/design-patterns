package com.sheqet.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase muestra un historial de datos meteorológicos.
 * No forma parte esencial del patrón, sino que es un agregado útil.
 */
public class HistoricalData implements Observer {
    private List<String> records = new ArrayList<>();

    @Override
    public void update(float temperature, float humidity, float pressure) {
        String record = "Temp: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa";
        records.add(record);
        System.out.println("Data saved: " + record);
    }

    public void showRecords() {
        System.out.println("Historical Data:");
        for (String record : records) {
            System.out.println(record);
        }
    }

}
