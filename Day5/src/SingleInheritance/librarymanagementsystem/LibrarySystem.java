package SingleInheritance.librarymanagementsystem;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("Concept of Physics", 1989 , "HC Verma", "The God of Physics");

        // Display details of the book and its author
        author.displayInfo();
    }
}
