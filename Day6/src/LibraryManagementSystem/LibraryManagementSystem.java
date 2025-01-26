package LibraryManagementSystem;

// Main class to demonstrate functionality
public class LibraryManagementSystem {
    public static void manageLibraryItem(LibraryItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Loan duration: " + item.getLoanDuration() + " days");
    }

    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "Concept of Physics", "HC Verma");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "DDLJ", "Aditya Chopra");

        // Polymorphism in action
        manageLibraryItem(book);
        manageLibraryItem(magazine);
        manageLibraryItem(dvd);

        // Reservable interface demonstration
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("Raj");
        System.out.println("Book availability: " + reservableBook.checkAvailability());


        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("Yogesh");
        System.out.println("Magazine availability: " + reservableMagazine.checkAvailability());


        Reservable reservableDvd = (Reservable) dvd;
        reservableDvd.reserveItem("Survesh");
        System.out.println("DVD availability: " + reservableDvd.checkAvailability());
    }
}
