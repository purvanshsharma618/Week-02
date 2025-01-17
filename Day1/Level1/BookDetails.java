class Book{
    String title;
    String author;
    double price;

Book(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
}
public void displayDetails(){
    System.out.println("Title : " + title);
    System.out.println("Author : " + author);
    System.out.println("Price : " + price);
}
}
public class BookDetails {
    public static void main(String[] args) {
        Book book = new Book("Concept of Physics", "HC Verma", 1000);
        book.displayDetails();
    }
    
}
