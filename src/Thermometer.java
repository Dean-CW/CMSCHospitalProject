import java.util.Random;

public class Thermometer extends Device {
    private Random randomTemp = new Random();

    private double generateReading()
    {
        double humanMin = 82.0;
        double humanMax = 106.0;
        return humanMin + (humanMax - humanMin) * randomTemp.nextDouble();
    }

    @Override
    public Observation reading() {
        double reading = generateReading();
        return new Temperature(reading);
    }
}
