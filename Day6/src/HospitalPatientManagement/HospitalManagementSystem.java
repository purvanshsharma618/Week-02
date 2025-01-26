package HospitalPatientManagement;

// Main class to demonstrate functionality
public class HospitalManagementSystem {
    public static void handlePatientDetails(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Bill Amount: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        InPatient inPatient = new InPatient("P001", "Raj", 45, 2000, 5);
        OutPatient outPatient = new OutPatient("P002", "Bobby", 30, 500);

        // Polymorphism in action
        handlePatientDetails(inPatient);
        handlePatientDetails(outPatient);

        // Add and view medical records
        inPatient.addRecord("Admitted for surgery. Recovering well.");
        System.out.println(inPatient.viewRecords());

        outPatient.addRecord("Diagnosed with flu. Prescribed medication.");
        System.out.println(outPatient.viewRecords());
    }
}