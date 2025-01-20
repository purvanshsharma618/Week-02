class Book{
    static String libraryName = "Central Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    public void displayLibraryName(){
        System.out.println("Library Name : " + libraryName);
    }
    public void displayBookDetails(){
        if(this instanceof Book){
            System.out.println("Title : " + title);
            System.out.println("Author : " + author);
            System.out.println("ISBN : " + isbn);
        } else{
            System.out.println("The Object is not an instance of the Library class.");
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Concept of Physics", "HC Verma", "ABC123");
        // Display Library Name
        book1.displayLibraryName();

        // Display Book Details
        book1.displayBookDetails();
    } 
}