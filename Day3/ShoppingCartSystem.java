class Product{
    static double discount = 5;
    String productName;
    final String productID;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, String productId){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productId;

    }

    public void displayDiscount(){
        System.out.println("Discount : " + discount + "%");
    }
    public void displayProductDetails(){
        if(this instanceof Product){
            System.out.println("Product Name : " + productName);
            System.out.println("Product ID : " + productID);
            System.out.println("Price :" + price);
            System.out.println("Quantity :" + quantity);

        }
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product = new Product("Shirts", 500, 04, "AB23");
        product.displayDiscount();
        product.displayProductDetails();
        
    }
    
}
