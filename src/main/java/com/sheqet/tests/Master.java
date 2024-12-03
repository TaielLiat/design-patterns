package com.sheqet.tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Master {
    public static void main(String[] args) {
        try {
            // URL de la API
            String apiUrl = "https://jsonplaceholder.typicode.com/users";

            // Crear un objeto URL
            URL url = new URL(apiUrl);

            // Abrir conexión
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");  // Método HTTP GET
            conn.setRequestProperty("Accept", "application/json"); // Tipo de respuesta

            // Comprobar el código de respuesta
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Error HTTP: " + conn.getResponseCode());
            }

            // Leer la respuesta
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                respuesta.append(linea).append("\n");
            }
            br.close();

            // Mostrar respuesta en consola
            System.out.println("Respuesta de la API:");
            System.out.println(respuesta.toString());

            // Cerrar conexión
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
