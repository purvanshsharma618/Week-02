package LibraryManagementSystem;

// Define the interface Reservable
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}
