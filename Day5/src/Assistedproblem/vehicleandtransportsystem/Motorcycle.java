package Assistedproblem.vehicleandtransportsystem;

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info: Max Speed = " + maxSpeed + " km/h \n Fuel Type = " + fuelType + " \n Has Sidecar = " + hasSidecar);
    }
}
