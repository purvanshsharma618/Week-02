class Mobile{
    String brand;
    String model;
    double price;

   Mobile(String brand, String model, double price){
    this.brand = brand;
    this.model = model;
    this.price = price;
   }

    public void displayDetails(){
        System.out.println("Brand :" + brand);
        System.out.println("Model :" + model);
        System.out.println("Price :" + price);
    }
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", "RMX1911", 10000);
        mobile.displayDetails();
    }
}
