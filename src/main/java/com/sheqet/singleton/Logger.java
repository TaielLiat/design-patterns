package com.sheqet.singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Clase que se encarga de escribir logs en un archivo. Es un Singleton, ya que solo se necesita una instancia para escribir los logs.
 */
public class Logger {
    private static Logger instance;
    private static final String LOG_FILE = "singleton-test.log";

    /**
     * Constructor privado para evitar instanciación
     * ---------------------------------------------
     * Al estar tanto privado como vacío evitamos que se pueda instanciar desde fuera de la clase,
     por lo que evitamos que se generen nuevas instancias y asegurando la persistencia de la instancia actual.
     */
    private Logger() {

    }

    /**
     * Método que devuelve la instancia de la clase Logger para que pueda ser accedido desde cualquier parte del código.
     * @return Instancia de la clase Logger.
     */
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public synchronized void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing the log: " + e.getMessage());
        }
    }
}
