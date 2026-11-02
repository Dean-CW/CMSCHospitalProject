import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HospitalTest {
    @Test
    void HospitalConstructor_createsHospitalWithCorrectNumberOfPatients() {
        int numPatients = 5;
        Hospital hospital = new Hospital(numPatients);
        assertEquals(numPatients, hospital.getPatients().length);
    }

    @Test
    void admitPatient_addsPatientsToHospital() {
        Hospital hospital = new Hospital(3);
        Patient pat1 = Patient.createPatient();
        Patient pat2 = Patient.createPatient();
        Patient pat3 = Patient.createPatient();
        hospital.admitPatient(pat1);
        hospital.admitPatient(pat2);
        hospital.admitPatient(pat3);
        assertEquals(pat1, hospital.getPatients()[0]);
        assertEquals(pat2, hospital.getPatients()[1]);
        assertEquals(pat3, hospital.getPatients()[2]);
    }
}
