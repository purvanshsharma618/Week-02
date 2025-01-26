package vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2; // Example: 20% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}

