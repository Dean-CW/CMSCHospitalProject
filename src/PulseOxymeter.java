import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class PulseOxymeter extends Device {
    private final double maxO2 = 1.0;
    private final Random randomO2 = new Random();


    private double generateO2Reading()
    {
        BigDecimal reading = new BigDecimal(maxO2 - randomO2.nextDouble(.22)).setScale(2, RoundingMode.DOWN);
        return reading.doubleValue();
    }

    @Override
    public Observation reading() {
        return new O2Level(generateO2Reading());
    }
}
