
// Parent class Student
class Student {
    public int rollNumber;  // Public: accessible everywhere
    protected String name;   // Protected: accessible within the class and subclasses
    private double CGPA;     // Private: accessible only within the class

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get and set CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass PostgraduateStudent (demonstrates protected access modifier)
class PostgraduateStudent extends Student {

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);  // Calls the parent class constructor
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        displayStudentDetails(); // Calls parent class method to display details
    }
}
