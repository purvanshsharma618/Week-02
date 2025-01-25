package HybridInheitance.RestaurantManagementSystem;

// Subclass: Waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, String id) {
        super(name, id); // Call the constructor of Person
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}

