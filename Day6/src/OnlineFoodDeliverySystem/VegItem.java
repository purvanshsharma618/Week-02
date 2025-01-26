package OnlineFoodDeliverySystem;

// Subclass VegItem
class VegItem extends FoodItem implements Discountable {
    private double totalPrice;
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.totalPrice = calculateTotalPrice();
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
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
