package ridehailingapplication;

// Define the abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + "\nDriver: " + driverName + "\nRate per km: " + ratePerKm;
    }
}