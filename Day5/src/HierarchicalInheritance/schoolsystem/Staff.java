package HierarchicalInheritance.schoolsystem;

// Subclass: Staff
class Staff extends Person {
    private String department; // Department the staff works in
    private String position;   // Position of the staff member

    public Staff(String name, int age, String department, String position) {
        super(name, age); // Call the constructor of Person
        this.department = department;
        this.position = position;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department + "\nPosition: " + position);
    }
}
