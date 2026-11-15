public class Temperature extends Observation {
    private double temp;

    public Temperature(double temp) {
        this.temp = temp;
    }

    @Override
    public boolean critical() {
        if (temp < 82.0 || temp > 106.0) {
            return true; // Critical temperature
        }
        return false;
    }

    @Override
    public String details() {
        return temp + "°F";
    }
}
