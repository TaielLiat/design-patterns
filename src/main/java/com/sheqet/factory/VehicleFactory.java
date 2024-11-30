package com.sheqet.factory;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new Car();
            case "truck" -> new Truck();
            case "motorcycle" -> new Motorcycle();
            default -> throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        };
    }
}
