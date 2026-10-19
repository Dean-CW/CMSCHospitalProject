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
    
}
