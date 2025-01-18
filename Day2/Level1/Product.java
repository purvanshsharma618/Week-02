public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable shared among all products

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment the totalProducts count whenever a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 120000);
        Product product2 = new Product("Smartphone", 10000);
        Product product3 = new Product("Headphones", 200);

        // Display individual product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
