package com.sheqet.builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // En estas consultas de consola simulamos una creación de computadora personalizada, la cual puede tener o no valores por defecto
        // (Los valores por defecto los defino, ya que no debería poder construirse una computadora
        // sin sus componentes básicos, pero en otro ejemplo podrían dejarse los valores vacíos)

        System.out.print("Enter CPU (leave empty for default): ");
        String cpu = scanner.nextLine();
        if (cpu.isEmpty()) {
            cpu = "Default CPU";
        }

        System.out.print("Enter RAM size (leave empty for 8GB default): ");
        String ramInput = scanner.nextLine();
        int ram = ramInput.isEmpty() ? 8 : Integer.parseInt(ramInput);

        System.out.print("Enter Storage size (leave empty for 256GB SSD default): ");
        String storage = scanner.nextLine();
        if (storage.isEmpty()) {
            storage = "256GB SSD";
        }

        // GPU: Pregunta al usuario o usa valor por defecto
        System.out.print("Enter GPU (leave empty for Integrated GPU default): ");
        String gpu = scanner.nextLine();
        if (gpu.isEmpty()) {
            gpu = "Integrated GPU";
        }

        /* Este código crea paso por paso el objeto Computadora.
         * En cada paso, se llama a un método de la clase ComputerBuilder para configurar un atributo de la computadora.
         * Al final, se llama al método build() para obtener el objeto Computadora completo.
         * Esto se hace para que podamos crear el objeto en diferentes formatos opcionales, osea, que pueden ser vacíos.
         */
        Computer computer = new ComputerBuilder()
                .setCPU(cpu)
                .setRAM(ram)
                .setStorage(storage)
                .setGPU(gpu)
                .build();

        System.out.println("\nYour custom computer has been built:");
        System.out.println(computer);
    }
}
