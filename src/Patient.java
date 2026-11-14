import java.util.Random;
public class Patient {
    private Integer id;
    private int age;
    private Device[] devices = new Device[4];

    public static Patient createPatient(){
        Patient patient = new Patient();
        patient.id = new Random().nextInt(9000) + 1000; // Generate a random 4-digit ID
        patient.age = new Random().nextInt(100);
        return patient;
    }

    public static void attachDevices(Patient pat){
        Patient.getDevices()[0] = new BloodPressureMonitor();
        Patient.getDevices()[1] = new HeartRateMonitor();
        Patient.getDevices()[2] = new Thermometer();
        Patient.getDevices()[3] = new PulseOxyMeter();
    }

    public Integer getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public static Device[] getDevices() {
        return devices;
    }

    public static void setDevices(Device[] devices) {
        this.devices = devices;
    }
    
    public String toString(){
        return "I am patient " + id;
    }
    
}
