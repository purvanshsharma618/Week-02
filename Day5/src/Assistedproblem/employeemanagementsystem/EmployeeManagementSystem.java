package Assistedproblem.employeemanagementsystem;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.displayDetails();



        emp=new Manager("Purvansh",1,2500,5);
        emp.displayDetails();
        System.out.println();

        emp=new Developer("Harsh",2,50000,"java");
        emp.displayDetails();
        System.out.println();

        emp=new Intern("Raj",3,25000);
        emp.displayDetails();
    }

}