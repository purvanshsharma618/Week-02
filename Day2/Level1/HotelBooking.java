public class HotelBooking {
    public String guestName;
    public String roomType;
    public int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Raj";
        this.roomType = "Single and Non-AC";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        // Default booking
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 - Guest: " + booking1.guestName + ", Room Type: " + booking1.roomType + ", Nights: " + booking1.nights);

        // Parameterized booking
        HotelBooking booking2 = new HotelBooking("Purvansh", "AC Room", 2);
        System.out.println("Booking 2 - Guest: " + booking2.guestName + ", Room Type: " + booking2.roomType + ", Nights: " + booking2.nights);

        // Copy of booking2
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 (Copy of Booking 2) - Guest: " + booking3.guestName + ", Room Type: " + booking3.roomType + ", Nights: " + booking3.nights);
    }
}
