import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PatientTest {
    @Test
    void createPatient_setsIdToNonNull() {
        Patient patient = Patient.createPatient();

        assertNotNull(patient);
        assertNotNull(patient.getId());
    }

    @Test
    void toString_includesPatientId() {
        Patient patient = Patient.createPatient();

        assertNotNull(patient.toString());
    }

    @Test
    void createPatient_generatesUniqueIds() {
        Patient patient1 = Patient.createPatient();
        Patient patient2 = Patient.createPatient();
        System.out.println("Patient 1 ID: " + patient1.getId() + ", Patient 2 ID: " + patient2.getId());
        assertEquals(false, patient1.getId().equals(patient2.getId()));
    }
}
