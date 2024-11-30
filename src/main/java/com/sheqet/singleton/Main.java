package com.sheqet.singleton;

/**
 * Esta clase MOCKEA el uso de la clase Logger, la cual es un Singleton.
 * Un Singleton debe ser cualquier clase que querramos que solo tenga una instancia en toda la aplicación.
 * No se puede instanciar directamente, sino que se debe acceder a la instancia mediante el método getInstance().
 * Y realizar modificaciones sobre este a partir de la instancia proporcionada.
 *
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Aplicación iniciada.");

        // Simular múltiples logs en diferentes partes del sistema
        for (int i = 1; i <= 3; i++) {
            logger.log("Evento importante " + i);
        }

        Logger nuevoLogger = Logger.getInstance();
        nuevoLogger.log("Aplicación finalizada usando la misma instancia.");
    }
}
