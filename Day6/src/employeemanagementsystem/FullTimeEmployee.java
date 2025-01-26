package employeemanagementsystem;

// FullTimeEmployee Class
class FullTimeEmployee extends Employee implements Department {
    private String department;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() ;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}