package HierarchicalInheritance.schoolsystem;

// Subclass: Student
class Student extends Person {
    private String grade; // Grade level of the student
    private String studentId; // Unique student ID

    public Student(String name, int age, String grade, String studentId) {
        super(name, age); // Call the constructor of Person
        this.grade = grade;
        this.studentId = studentId;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade + "\nStudent ID: " + studentId);
    }
}

