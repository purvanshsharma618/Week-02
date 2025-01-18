// Parent class Book
class Book {
    public String ISBN;     // Public: accessible everywhere
    protected String title;  // Protected: accessible within the class and subclasses
    private String author;   // Private: accessible only within the class

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook (demonstrates access to ISBN and title)
class EBook extends Book {

    // Constructor for EBook
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);  // Calls the parent class constructor
    }

    // Method to display eBook details (accessing protected and public members)
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);  // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
    }
}

public class TestBookLibrary {
    public static void main(String[] args) {
        // Create an instance of Book class
        Book book1 = new Book("12345", "Java Programming", "John Smith");
        book1.displayBookDetails();
        System.out.println();

        // Modify author using public method
        book1.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book1.getAuthor());
        System.out.println();

        // Create an instance of EBook subclass
        EBook ebook1 = new EBook("67890", "Advanced Java", "Mark Johnson");
        ebook1.displayEBookDetails();
    }
}
