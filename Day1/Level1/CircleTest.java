import java.util.Scanner;

class Circle {
    // Attribute
     double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = pi * r^2
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius; // Circumference = 2 * pi * r
    }

    // Method to display the area and circumference
    public void display() {
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating an instance of Circle
        Circle circle = new Circle(radius);

        // Displaying the area and circumference
        circle.display();

        // Close the scanner
        scanner.close();
    }
}