class  Item{
    int ItemCode;
    String ItemName;
    double price;

Item(int ItemCode, String ItemName, double price){
    this.ItemCode = ItemCode;
    this.ItemName = ItemName;
    this.price = price;
}
public void displayDetails(){
    System.out.println("ItemCode:" + ItemCode);
    System.out.println("ItemName :" + ItemName);
    System.out.println("price :" + price);
}

 public double calculateTotalCost(int quantity){
    return quantity*price;
 }

}

public class InventoryItems {
    public static void main(String[] args) {
        Item item = new Item(101, "Cycle", 1000);
        item.displayDetails();
        int quantity = 10;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost of quantity " + quantity + ":" + totalCost);
    }
}
