package OnlineFoodDeliverySystem;

// Subclass NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;
    private final double additionalCharge = 50; // Non-veg items have an additional charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = totalPrice * discountPercentage / 100;
        totalPrice -= discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount + "\nFinal Price: " + totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
