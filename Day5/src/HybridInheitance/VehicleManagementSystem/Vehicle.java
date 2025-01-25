package HybridInheitance.VehicleManagementSystem;

// Base Class: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model + "\nMax Speed: " + maxSpeed + " km/h");
    }
}

