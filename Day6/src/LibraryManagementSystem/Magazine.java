package LibraryManagementSystem;

// Subclass Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Magazine reserved by: " + borrower);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
