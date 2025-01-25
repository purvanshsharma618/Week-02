package HybridInheitance.RestaurantManagementSystem;

// Base Class: Person
class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nID: " + id);
    }
}
