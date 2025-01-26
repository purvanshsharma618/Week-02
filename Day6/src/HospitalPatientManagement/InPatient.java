package HospitalPatientManagement;

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private double roomChargePerDay;
    private int daysAdmitted;
    private String medicalHistory;

    public InPatient(String patientId, String name, int age, double roomChargePerDay, int daysAdmitted) {
        super(patientId, name, age);
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return roomChargePerDay * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.medicalHistory = record;
    }

    @Override
    public String viewRecords() {
        return "Medical History: " + (medicalHistory != null ? medicalHistory : "No records available");
    }
}
