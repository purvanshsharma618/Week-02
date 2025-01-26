package ridehailingapplication;

// Main class to demonstrate functionality
public class RideHailingApp {
    public static void calculateDynamicFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", "Raj", 15.0);
        Vehicle bike = new Bike("BIKE456", "Yogesh", 8.0);
        Vehicle auto = new Auto("AUTO789", "Dogesh", 10.0);

        calculateDynamicFare(car, 10); // Polymorphism in action
        calculateDynamicFare(bike, 5);
        calculateDynamicFare(auto, 7);

        // Demonstrate GPS functionality
        GPS carGps = (GPS) car;
        carGps.updateLocation("Downtown");
        System.out.println("Car Location: " + carGps.getCurrentLocation());
    }
}