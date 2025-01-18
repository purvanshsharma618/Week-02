
public class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Karmayog";
        this.author = "Swami Vivekanand";
        this.price = 500;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        defaultBook.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book parameterizedBook = new Book("Concept of Physics", "HC Verma", 1000);
        parameterizedBook.displayBookDetails();
    }
}
