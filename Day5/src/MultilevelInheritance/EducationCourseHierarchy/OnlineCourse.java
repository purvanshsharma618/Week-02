package MultilevelInheritance.EducationCourseHierarchy;

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    protected String platform; // e.g., "Coursera", "Udemy"
    protected boolean isRecorded; // True if the course is pre-recorded

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the constructor of Course
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseDetails() {
        String type = isRecorded ? "Pre-recorded" : "Live";
        return super.getCourseDetails() + ", Platform: " + platform + ", Type: " + type;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println(getCourseDetails());
    }
}

