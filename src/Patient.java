import java.util.Random;
public class Patient {
    private Integer id;

    public static Patient createPatient(){
        Patient patient = new Patient();
        patient.id = new Random().nextInt(9000) + 1000; // Generate a random 4-digit ID
        return patient;
    }

    public Integer getId() {
        return id;
    }
    public String toString(){
        return "I am patient " + id;
    }
    
}
