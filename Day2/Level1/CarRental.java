public class CarRental {
    public String customerName;
    public String carModel;
    public int rentalDays;
    public static final double DAILY_RATE = 50.0; // Daily rental cost in USD

    // Default constructor
    public CarRental() {
        this.customerName = "Raj";
        this.carModel = "Fortuner";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    // Display rental details
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Default rental
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

        System.out.println();

        // Parameterized rental
        CarRental rental2 = new CarRental("Purvansh", "Scorpio", 5);
        rental2.displayDetails();
    }
}

