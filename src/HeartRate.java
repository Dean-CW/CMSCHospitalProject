public class HeartRate extends Observation{
    private int rate;
    private int age;

    public HeartRate(int BPM, int age) {
        this.rate = BPM;
        this.age = age;
    }
    
    @Override
    public boolean critical() {
        int maxHeartRate = 220 - age;
        int minHearRate = 39;
        if (this.rate > maxHeartRate || this.rate < minHearRate) {
            return true; // Critical heart rate
        }
        return false;
    }

    @Override
    public String details() {
        return "Heartrate: " + rate + " bpm";
    }


}
