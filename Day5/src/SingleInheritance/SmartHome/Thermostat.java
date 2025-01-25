package SingleInheritance.SmartHome;

// Subclass: Thermostat
class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call the constructor of the superclass
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Display general device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

