package com.sheqet.observer;

/** Ejemplo cámaras:
 *
 * Esta clase sería la que defina el comportamiento del sistema al detectar movimiento.
 * En su caso, podría ser:
 *  * Enviar una notificación
 *  * Guardar la imágen
 *  * Activar una alarma
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
