class Vehicle{
    static double registrationFee = 1500;
    String ownerName;
    String vehicleType;
    final String registrationNumber;


    Vehicle(String ownerName, String vehicletype, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicletype;
        this.registrationNumber = registrationNumber;
    }
    public void displayRegistrationFee(){
        System.out.println("Registration Fee : " + registrationFee);
    }
    public void displayVehicleDetails(){
        if(this instanceof Vehicle){
           
            System.out.println("Owner Name : " + ownerName);
            System.out.println("Vehicle Type : " + vehicleType);
            System.out.println("Registration Number : " + registrationNumber);
        }
    }

}


public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Purvansh", "EV", "MP 02 EV 2024");
        vehicle1.displayRegistrationFee();
        vehicle1.displayVehicleDetails();
    }
    
}
