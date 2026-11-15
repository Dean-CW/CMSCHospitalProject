public class O2Level extends Observation {
    private double o2Level;

    public O2Level(double o2Level) {
        this.o2Level = o2Level;
    }
    
    @Override
    public boolean critical() {
        if (o2Level < 0.8) {
            return true;
        }
        return false;
    }

    @Override
    public String details() {
        return "Oxygen Level: " + o2Level;
    }
}
