class Student{
    String name;
    String rollNumber;
    int marks;

    Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    } 
    public String calculateResult(){
        if(marks > 90){
            return "A";
        } else if(marks>80 && marks <91){
            return "B";
        } else if(marks>70 && marks <81){
            return "C";
        }else if(marks>60 && marks <71){
            return "D";
        }else {
            return "E";
        }

    }

    public void displayDetails(){
        String grades = calculateResult();
        System.out.println("Name : " + name);
        System.out.println("RollNumber :" + rollNumber);
        System.out.println("Marks :" + marks);
        System.out.println("Grades :" + grades);
    }

}

public class StudentReport {
      public static void main(String[] args) {
        Student student1 = new Student("Purvansh", "129", 99);
        student1.displayDetails();
        Student student2 = new Student("Raj", "130", 99);
        student2.displayDetails();
      }
    
}

