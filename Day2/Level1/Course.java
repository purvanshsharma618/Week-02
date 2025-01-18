public class Course {
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;
    private static String instituteName = "Technocrats"; // Shared across all courses

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Create some courses
        Course course1 = new Course("Java Programming", 10, 4500);
        Course course2 = new Course("Data Science", 15, 5000);

        // Display course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update the institute name
        Course.updateInstituteName("BridgeLabz");

        // Display course details again to reflect the updated institute name
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
