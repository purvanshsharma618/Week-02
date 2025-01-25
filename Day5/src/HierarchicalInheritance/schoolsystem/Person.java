package HierarchicalInheritance.schoolsystem;

// Base Class: Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
