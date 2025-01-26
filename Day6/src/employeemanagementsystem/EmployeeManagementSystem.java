package employeemanagementsystem;
import java.util.*;
// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create Employees
        FullTimeEmployee fte = new FullTimeEmployee(1, "Raj", 50000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(2, "Yogesh", 20000, 20, 500);
        pte.assignDepartment("Sales");

        // Add to List
        employees.add(fte);
        employees.add(pte);

        // Process and Display Employee Details
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println();
        }
    }
}