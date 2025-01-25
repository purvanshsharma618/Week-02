package MultilevelInheritance.OnlineRetailOrderManagement;

// Main Class: RetailOrderManagement
public class RetailOrderManagement {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order("ORD001", "2025-01-20");

        // Create a shipped order
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-18", "TRK12345");

        // Create a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-15", "TRK67890", "2025-01-23");

        // Display order details and statuses
        System.out.println("Order Details:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\nShipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println("\nDelivered Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}

