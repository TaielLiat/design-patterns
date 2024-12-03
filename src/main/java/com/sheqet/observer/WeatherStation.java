package com.sheqet.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase maneja la lista de observadores
 * y notifica a los observadores cuando cambian los datos.
 *
 * Caso cámara:
 * Esta clase manejaría los observadores de cada una de las cámaras,
 * y les avisaría cuando deben actuar (notificar, grabar, parar, etc.).
 *
 */
public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
