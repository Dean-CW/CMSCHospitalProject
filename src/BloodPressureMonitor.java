import java.util.Random;

public class BloodPressureMonitor extends Device {
    final int minDiastolic = 50;
    final int minSystolic = 85;
    final int maxDiastolic = 200;
    final int maxSystolic = 340;
    private final Random randomBPReading = new Random();


    private int generateSystolicReading()
    {
        return minSystolic + randomBPReading.nextInt(maxSystolic - minSystolic);
    }

    private int generateDiastolicReading()
    {
        return minDiastolic + randomBPReading.nextInt(maxDiastolic - minDiastolic);
    }

    @Override
    public Observation reading() {
        int systolic = generateSystolicReading();
        int diastolic = generateDiastolicReading();
        return new BloodPressure(systolic, diastolic);
    }
}
