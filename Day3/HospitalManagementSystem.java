class Patient {
    // Static variable shared among all instances
    static String hospitalName = "City Hospital";
    static int totalPatients = 0; // Counter for total patients admitted

    // Final variable to uniquely identify each patient
    final int patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Static method to get the total patients admitted
    static int getTotalPatients() {
        return totalPatients;
    }

    // Constructor to initialize patient details using 'this'
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment the total patients count
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital: " + hospitalName);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient(101, "Purvansh", 21, "Fever");
        Patient patient2 = new Patient(102, "Raj", 22, "Migraine");

        // Using 'instanceof' to check if an object is of type Patient
        if (patient1 instanceof Patient) {
            System.out.println("Patient 1 details:");
            patient1.displayDetails();
        }

        if (patient2 instanceof Patient) {
            System.out.println("\nPatient 2 details:");
            patient2.displayDetails();
        }

        // Display total patients admitted
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());
    }
}