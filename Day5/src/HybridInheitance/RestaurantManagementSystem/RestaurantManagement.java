package HybridInheitance.RestaurantManagementSystem;

// Main Class: RestaurantManagement
public class RestaurantManagement {
    public static void main(String[] args) {
        // Create a Chef and a Waiter
        Chef chef = new Chef("Sanjeev Kapoor", "C001");
        Waiter waiter = new Waiter("Chaman", "W001");

        // Display details and perform duties
        System.out.println("\nChef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}
