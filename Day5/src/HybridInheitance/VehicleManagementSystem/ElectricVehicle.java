package HybridInheitance.VehicleManagementSystem;

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryLevel; // Battery level of the electric vehicle (percentage)

    public ElectricVehicle(String model, int maxSpeed, int batteryLevel) {
        super(model, maxSpeed); // Call the constructor of Vehicle
        this.batteryLevel = batteryLevel;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging.\nBattery level: " + batteryLevel + "%");
    }
}

