public class Library {
    public String title;
    public String author;
    public double price;
    public boolean isAvailable;

    // Default constructor
    public Library() {
        this.title = "Karmayog";
        this.author = "Swami Vivekanand";
        this.price = 5000.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Library(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Set the book as borrowed
            System.out.println("You have successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Create a book using the parameterized constructor
        Library book1 = new Library("Concept of Physics", "HC Verma", 1000, true);

        // Display book details
        book1.displayDetails();

        // Borrow the book
        book1.borrowBook();

        // Attempt to borrow the book again
        book1.borrowBook();

        // Display book details after borrowing
        book1.displayDetails();
    }
}

