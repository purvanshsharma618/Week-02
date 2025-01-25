package HybridInheitance.RestaurantManagementSystem;

// Subclass: Chef
class Chef extends Person implements Worker {
    public Chef(String name, String id) {
        super(name, id); // Call the constructor of Person
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

