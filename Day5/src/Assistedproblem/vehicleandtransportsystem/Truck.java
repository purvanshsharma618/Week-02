package Assistedproblem.vehicleandtransportsystem;

// Subclass Truck
class Truck extends Vehicle {
    int loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Info: Max Speed = " + maxSpeed + " km/h \n Fuel Type = " + fuelType + " \n Load Capacity = " + loadCapacity + " tons");
    }
}

