import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Thermometer extends Device {
    private Random randomTemp = new Random();

    private double generateReading()
    {
        double humanMin = 82.0;
        double humanMax = 106.0;
        BigDecimal reading = new BigDecimal(humanMin + (humanMax - humanMin) * randomTemp.nextDouble()).setScale(1, RoundingMode.DOWN);
        return reading.doubleValue();
    }

    @Override
    public Observation reading() {
        double reading = generateReading();
        return new Temperature(reading);
    }
}
