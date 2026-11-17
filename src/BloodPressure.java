public class BloodPressure extends Observation {
    private int systolic;
    private int diastolic;
    
    public BloodPressure(int systolic, int diastolic) {
        this.systolic = systolic;
        this.diastolic = diastolic;
    }
    
    @Override
    public boolean critical() {
        if (systolic > 130 || diastolic > 90) {
            return true; // Hypertensive crisis
        } else if (systolic < 90 || diastolic < 60) {
            return true; // Hypotension
        }
        return false; // Normal range
        
    }

    @Override
    public String details() {
        return "Blood Pressure: " + systolic + "/" + diastolic; //Need to implement
    }
}
