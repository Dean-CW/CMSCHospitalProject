import java.util.Random;

public class Simulation {
    private static Random(int seed) rand;

    Hospital hospital = new Hospital();

    public Simulation() {
       // No-op
    }
    private void run() {

    }

    private void setup() {}

    private void process() {}

    public static setRandom(Random rand) {
        this.rand = rand;
    }

    public Hospital getHospital() {
        return hospital;
    }
}
