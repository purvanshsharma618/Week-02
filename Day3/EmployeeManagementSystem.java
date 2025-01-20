class Employee{
    static String companyName = "Technocrats";
    String name;
    final String id;
    String designation;

    Employee(String name, String id, String designation){
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    public void displayCompanyName(){
        System.out.println("Company Name : " + companyName);
    }
    public void displayEmployeeDetails(){
        if(this instanceof Employee){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Designation : " + designation);
        }
    }
}

public class EmployeeManagementSystem{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Manohar", "ABC123", "Chaprasi");
        employee1.displayCompanyName();
        employee1.displayEmployeeDetails();
     
    }
}