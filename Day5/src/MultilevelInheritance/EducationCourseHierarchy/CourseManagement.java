package MultilevelInheritance.EducationCourseHierarchy;

// Main Class: CourseManagement
public class CourseManagement {
    public static void main(String[] args) {
        // Create a general course
        Course course = new Course("Mathematics 101", 12);

        // Create an online course
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);

        // Create a paid online course
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science Bootcamp", 16, "Coursera", false, 300.0, 20.0);

        // Display details of all courses
        System.out.println("General Course Details:");
        course.displayCourseInfo();

        System.out.println("\nOnline Course Details:");
        onlineCourse.displayCourseInfo();

        System.out.println("\nPaid Online Course Details:");
        paidOnlineCourse.displayCourseInfo();
    }
}

