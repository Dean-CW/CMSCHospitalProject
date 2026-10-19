import java.util.Random;
public class Patient {
    private Integer id;

    public static Patient createPatient(){
        Patient patient = new Patient();
        patient.id = Math.abs(new Random().nextInt());
        return patient;
    }

    public Integer getId() {
        return id;
    }
    public String toString(){
        return "I am patient " + id;
    }
}
