package HybridInheitance.VehicleManagementSystem;

// Main Class: VehicleManagement
public class VehicleManagement {
    public static void main(String[] args) {
        // Create Electric and Petrol Vehicles
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220, 80);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 250, 60);

        // Display details and behaviors of ElectricVehicle
        System.out.println("\nElectric Vehicle Details:");
        ev.displayDetails();
        ev.charge(); // Charging electric vehicle

        // Display details and behaviors of PetrolVehicle
        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel(); // Refueling petrol vehicle
    }
}

