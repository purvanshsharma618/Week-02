package HospitalPatientManagement;

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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