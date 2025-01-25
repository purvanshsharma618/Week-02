package SingleInheritance.SmartHome;

// Main Class: SmartHomeSystem
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a general device
        Device device = new Device("D001", "Online");

        // Create a thermostat device
        Thermostat thermostat = new Thermostat("T001", "Online", 22.5);

        // Display the status of both devices
        System.out.println("General Device Status:");
        device.displayStatus();

        System.out.println("\nThermostat Status:");
        thermostat.displayStatus();
    }
}
