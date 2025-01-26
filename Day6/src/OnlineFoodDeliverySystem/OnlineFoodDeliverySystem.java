package OnlineFoodDeliverySystem;

// Main class to demonstrate functionality
public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: " + item.calculateTotalPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1);

        // Process orders using polymorphism
        processOrder(vegItem);
        processOrder(nonVegItem);

        // Apply discounts
        Discountable discountableVeg = (Discountable) vegItem;
        discountableVeg.applyDiscount(10); // Apply 10% discount
        System.out.println(discountableVeg.getDiscountDetails());

        Discountable discountableNonVeg = (Discountable) nonVegItem;
        discountableNonVeg.applyDiscount(15); // Apply 15% discount
        System.out.println(discountableNonVeg.getDiscountDetails());
    }
}