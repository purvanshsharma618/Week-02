package Assistedproblem.employeemanagementsystem;

class Developer extends Employee{

    String programmingLanguage;
    Developer(String name, int id,int salary,String programmingLanguage) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    void displayDetails(){

        System.out.println("programmingLanguage = "+ programmingLanguage + "\n Name : "+ name + "\n id : " +id + "\n Salary "+salary);
    }
}
