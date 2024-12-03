package com.sheqet.observer;


/** Este patrón lo voy a explicar basándome en este ejemplo famoso:
 *
 *  Las cámaras:
 *  * Un edificio tiene múltiples cámaras, y solo queremos que GRABEN la imágen
 *  * cuando detectan a una persona u otro movimiento, así se puede ahorrar memoria.
 *  *
 *  * Al detectar actividad, la cámara puede, por ejemplo, enviarnos una notificación.
 *  *
 *  */

// Esta clase es la que va a configurar los observadores y simular el comportamiento de las cámaras
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        DisplayScreen display = new DisplayScreen();
        HistoricalData history = new HistoricalData();
        HeatAlert heatAlert = new HeatAlert();

        station.addObserver(display);
        station.addObserver(history);
        station.addObserver(heatAlert);

        // Datos simulados, acá se tendría la conexión con las cámaras.
        station.setMeasurements(30, 65, 1013);
        station.setMeasurements(36, 70, 1010);
        station.setMeasurements(28, 60, 1015);

        history.showRecords();
    }
}
