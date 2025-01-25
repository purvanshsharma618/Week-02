package Assistedproblem.employeemanagementsystem;
class Manager extends Employee{

    int teamSize;
    Manager(String name, int id,int salary,int teamSize) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.teamSize=teamSize;
    }

    @Override
    void displayDetails(){

        System.out.println("Team Size = "+ teamSize +" Name : "+name+ " id : "+id+" Salary "+salary);
    }
}