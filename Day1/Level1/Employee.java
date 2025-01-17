class Employee {
    // Attributes
    String name;
     int id;
     double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.printf("Employee Salary: %.2f%n", salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp1 = new Employee("Purvansh", 100, 75000.00);
        
        // Displaying the details of the employee
        emp1.displayDetails();
    }
}
