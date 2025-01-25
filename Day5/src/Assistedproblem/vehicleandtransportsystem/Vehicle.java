package Assistedproblem.vehicleandtransportsystem;

// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: Max Speed = " + maxSpeed + " km/h, \n Fuel Type = " + fuelType);
    }
}
