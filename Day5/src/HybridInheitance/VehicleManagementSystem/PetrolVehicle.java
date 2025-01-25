package HybridInheitance.VehicleManagementSystem;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelLevel; // Fuel level of the petrol vehicle (percentage)

    public PetrolVehicle(String model, int maxSpeed, int fuelLevel) {
        super(model, maxSpeed); // Call the constructor of Vehicle
        this.fuelLevel = fuelLevel;
    }

    // Implement the refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling.\nFuel level: " + fuelLevel + "%");
    }
}
