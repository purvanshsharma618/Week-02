import java.util.ArrayList;

// Class representing an item in the shopping cart
class CartItem {
    String itemName; // Name of the item
    double price;    // Price of the item
    int quantity;    // Quantity of the item

    // Constructor to initialize a CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the cost of this item (price * quantity)
    public double getItemTotalCost() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getItemTotalCost());
    }
}

// Class to handle shopping cart operations
class ShoppingCart {
    ArrayList<CartItem> cartItems; // List to hold items in the cart

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        boolean itemRemoved = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).itemName.equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println("Removed " + itemName + " from the cart.");
                itemRemoved = true;
                break;
            }
        }
        if (!itemRemoved) {
            System.out.println("Item " + itemName + " not found in the cart.");
        }
    }

    // Method to calculate and display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getItemTotalCost();
        }
        System.out.println("Total cost of the cart: " + totalCost);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (CartItem item : cartItems) {
            item.displayItem();
            System.out.println();
        }
    }
}

// Main class to test the shopping cart functionality
public class ShoppingCartSimulation {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Apple", 1.5, 4);
        cart.addItem("Milk", 2.0, 2);
        cart.addItem("Bread", 1.2, 3);

        // Display all items in the cart
        cart.displayCart();

        // Display the total cost of the cart
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Milk");

        // Display the cart again after removal
        cart.displayCart();

        // Display the updated total cost
        cart.displayTotalCost();
    }
}
