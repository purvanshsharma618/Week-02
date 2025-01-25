package HierarchicalInheritance.schoolsystem;

// Subclass: Teacher
class Teacher extends Person {
    private String subject; // Subject the teacher teaches

    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the constructor of Person
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
