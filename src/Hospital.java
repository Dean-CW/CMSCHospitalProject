import edu.frederick.Queue;

import java.util.Calendar;
import java.util.Date;

public class Hospital {
    private Patient[] patients;
    private Queue<Alert> newPatientAlerts = new Queue<Alert>();
    private Queue<Alert> processedPatientAlerts = new Queue<Alert>();
    public Hospital(int numPatients) {
        this.patients = new Patient[numPatients];
    }

    public void admitPatient(Patient patient){
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                System.out.println("Admitted patient with ID: " + patient.getId());
                return;
            }
        }
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void readPatientDevices(Date timePulled) {

        for (Patient patient : getPatients()) {
            Device[] devices = patient.getDevices();
            for (Device device : devices) {
                Observation obs = device.reading();
                if (obs.critical()) {
                    Alert alert = new Alert(obs, timePulled);
                    newPatientAlerts.enqueue(alert);
                }
            }
        }
    }

    public void resolveAlerts(Calendar calendar) {
        for (int i = 0; i < nurses.length; i++) {
            Queue<Alert> resolvedPatientAlerts = nurses[i].resolve();
            while (resolvedPatientAlerts.count() > 0 && resolvedPatientAlerts.peek() != null) {
                Alert processedAlert = resolvedPatientAlerts.dequeue();
                if (processedAlert.getStatus() != AlertStatus.RESOLVED) {
                    unresolvedAlerts.enqueue(processedAlert); //Put it in a queue to reprocess again
                } else {
                    processedAlert.setResolved(calendar.getTime());
                    resolvedAlerts.enqueue(processedAlert);
                }
                System.out.print(processedAlert.toString() + "\n");
            }
        }
    }

    public void assignAlerts()
    {
            while (newPatientAlerts.count() > 0 && newPatientAlerts.peek() != null) {
                for (Nurse nurse : nurses) {
                    nurse.assign(newPatientAlerts.dequeue());
                }
            }
    }

}
