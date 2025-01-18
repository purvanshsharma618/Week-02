public class Circle {
    public double radius; // Public radius attribute

    // Default constructor
    public Circle() {
        this(10); // Calls the parameterized constructor with radius = 0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Using default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.radius);
        System.out.println("Circle 1 - Area: " + circle1.getArea());
        System.out.println("Circle 1 - Circumference: " + circle1.getCircumference());

        // Using parameterized constructor
        Circle circle2 = new Circle(5);
        System.out.println("Circle 2 - Radius: " + circle2.radius);
        System.out.println("Circle 2 - Area: " + circle2.getArea());
        System.out.println("Circle 2 - Circumference: " + circle2.getCircumference());
    }
}
