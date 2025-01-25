package MultilevelInheritance.OnlineRetailOrderManagement;

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the constructor of the superclass
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Call superclass method
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
