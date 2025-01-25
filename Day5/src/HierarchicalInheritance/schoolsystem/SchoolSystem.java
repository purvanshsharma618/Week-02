package HierarchicalInheritance.schoolsystem;

// Main Class: SchoolSystem
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Purvansh", 25, "Mathematics");
        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
        teacher.displayRole();

        // Create a Student
        Student student = new Student("Yogesh", 16, "10th Grade", "STU12345");
        System.out.println("\nStudent Details:");
        student.displayDetails();
        student.displayRole();

        // Create a Staff Member
        Staff staff = new Staff("Dogesh", 40, "Administration", "Clerk");
        System.out.println("\nStaff Details:");
        staff.displayDetails();
        staff.displayRole();
    }
}
