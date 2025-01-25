package SingleInheritance.SmartHome;

// Superclass: Device
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + " \nStatus: " + status);
    }
}
