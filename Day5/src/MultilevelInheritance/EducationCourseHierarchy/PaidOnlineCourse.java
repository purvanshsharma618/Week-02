package MultilevelInheritance.EducationCourseHierarchy;

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee; // Course fee
    private double discount; // Discount percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the constructor of OnlineCourse
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + ", Fee: " + fee + ", Discount: " + discount + "%, Final Fee: $" + getFinalFee();
    }

    @Override
    public void displayCourseInfo() {
        System.out.println(getCourseDetails());
    }
}
