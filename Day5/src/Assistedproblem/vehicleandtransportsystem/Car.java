package Assistedproblem.vehicleandtransportsystem;

// Subclass Car
class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info: Max Speed = " + maxSpeed + " km/h \n Fuel Type = " + fuelType + " \n Seat Capacity = " + seatCapacity);
    }
}
