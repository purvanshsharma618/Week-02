package vehiclerentalsystem;

import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 500, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE456", 200, "BIKE-INS-002"));
        vehicles.add(new Truck("TRUCK789", 1000, "TRUCK-INS-003"));

        int rentalDays = 5; // Example rental duration

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            // Demonstrate Insurable interface
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println("Insurance Details: " + insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}