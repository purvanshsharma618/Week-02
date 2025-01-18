public class Person {
    public String name;
    public int age;

    // Default constructor
    public Person() {
        this.name = "Raj";
        this.age = 20;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        // Create a person using the parameterized constructor
        Person person1 = new Person("Purvansh", 21);

        // Create a copy of person1 using the copy constructor
        Person person2 = new Person(person1);

        // Display the attributes of both persons
        System.out.println("Person 1 - Name: " + person1.name + ", Age: " + person1.age);
        System.out.println("Person 2 - Name: " + person2.name + ", Age: " + person2.age);
    }
}

