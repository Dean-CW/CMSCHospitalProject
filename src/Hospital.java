public class Hospital {
    private Patient[] patients;

    public Hospital(int numPatients) {
        this.patients = new Patient[numPatients];
    }

    public void admitPatient(Patient patient){
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                System.out.println("Admitted patient with ID: " + patient.getId());
                return;
            }
        }
    }

    public Patient[] getPatients() {
        return patients;
    }

}
