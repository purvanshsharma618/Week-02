package SingleInheritance.librarymanagementsystem;

// Superclass
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Info: \n Title = " + title + " \n Publication Year = " + publicationYear);
    }
}
