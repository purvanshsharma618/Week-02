public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 150.00; // Fixed registration fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee has been updated to: " + registrationFee);
    }

    public static void main(String[] args) {
        // Create some vehicles
        Vehicle vehicle1 = new Vehicle("Raj", "Car");
        Vehicle vehicle2 = new Vehicle("Purvansh", "Motorcycle");

        // Display vehicle details
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Update the registration fee
        Vehicle.updateRegistrationFee(200.00);

        // Display vehicle details again to reflect the updated registration fee
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
