package ridehailingapplication;

// Define the interface GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
