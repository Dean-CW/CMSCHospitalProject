import java.util.Random;

public class HeartRateMonitor extends Device {

    private final int minBPM = 30;
    private final int maxBPM = 220;
    private int patientAge;
    private final Random randomBPM = new Random();

    public HeartRateMonitor(int patientAge)
    {
        setPatientAge(patientAge);
    }


    private int getPatientAge() {
        return patientAge;
    }

    private void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    private int generateBPM()
    {
        return minBPM + randomBPM.nextInt(maxBPM-minBPM);
    }
    @Override
    public Observation reading() {
        return new HeartRate(generateBPM(),getPatientAge() );
    }
}
