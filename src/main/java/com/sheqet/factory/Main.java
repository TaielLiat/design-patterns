package com.sheqet.factory;

import java.util.Scanner;

/**
 * Esta clase gestiona la creación de vehículos dependiendo de la decisión del usuario.
 * Le delega la creación a la clase VehicleFactory.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle you want to create (car/truck/motorcycle): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);

        System.out.println("You have created a " + vehicleType + ".");

        vehicle.drive();
    }
}
