import java.util.Random;
public class Patient {
    private Integer id;
    private int age;
    private Device[] devices = new Device[4];

    public Patient(){
        id = new Random().nextInt(9000) + 1000; // Generate a random 4-digit ID
        age = new Random().nextInt(100);
        attachDevices();
    }

    public void attachDevices(){
        getDevices()[0] = new BloodPressureMonitor();
        getDevices()[1] = new HeartRateMonitor(getAge());
        getDevices()[2] = new Thermometer();
        getDevices()[3] = new PulseOxymeter();
    }

    public Integer getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }
    
    public String toString(){
        return "I am patient " + id;
    }
    
}
