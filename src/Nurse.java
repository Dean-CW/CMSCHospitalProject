import java.util.Random;
public class Nurse {
    private Queue<Alert> newPatientAlerts = new Queue<Alert>();
    private Queue<Alert> processedPatientAlerts = new Queue<Alert>();
    public Nurse() {
        
    }
    public void assign(Alert alert) {
        newPatientAlerts.enqueue(alert);
    }

    public Queue<Alert> resolve(){
        while (newPatientAlerts.count() > 0 && newPatientAlerts.peek() != null) {
            Alert alert = newPatientAlerts.dequeue();
            if(resolveProbability()) {
                alert.processAlert();
                processedPatientAlerts.enqueue(alert);
            } else {
                alert.setStatus(AlertStatus.PENDING);
                processedPatientAlerts.enqueue(alert);
            }
        }
        
        return processedPatientAlerts;
    }

    private boolean resolveProbability() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

