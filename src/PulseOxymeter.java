import java.util.Random;

public class PulseOxymeter extends Device {
    private final double minO2 = .88;
    private final double maxO2 = 1.0;
    private final Random randomO2 = new Random();


    private double generateO2Reading()
    {
        return maxO2 - randomO2.nextDouble(.3);
    }

    @Override
    public Observation reading() {
        return new O2Level(generateO2Reading());
    }
}
