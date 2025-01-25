package Assistedproblem.employeemanagementsystem;

class Intern extends Employee {

    Intern(String name, int id,int salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;

    }

    @Override
    void displayDetails(){

        System.out.println( "Intern Name : " + name + "\n id : " + id + "\n Salary "+salary);
    }
}
