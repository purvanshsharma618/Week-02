class Student{
    static String universityName = "RGPV" ;
    String name;
    final String rollNumber;
    char grade;
    static int totalStudents  =0;
    Student(String name, String rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    void displayUniversityName(){
        System.out.println("Universty Name : " + universityName);
    }
    void displayStudentDetails(){
        if (this instanceof Student){
        System.out.println("Name :" + name);
        System.out.println("Roll Number :" + rollNumber);
        System.out.println("Grade : " + grade);
        }
    }
    static void displayTotalstudents(){
        System.out.println("Total Students : " + totalStudents);
    }
}



public class UniversityStudentManagement{
    public static void main(String[] args) {
        Student student1 = new Student("Purvansh", "0111CS211129", 'A');
        student1.displayUniversityName();
        student1.displayStudentDetails();
        Student.displayTotalstudents();
    }

}