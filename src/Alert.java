
import java.util.Date;

public class Alert {
    private Date received;  //TODO:  This type may need to change based on implementation
    private int secondsElapsed = 0; //TODO:  This type may need to change based on implementation

    private Severity severity;
    private AlertStatus status;
    private Observation observationDetails;

    public Alert(Observation observation, Date timeReceived, Severity alertSeverity) {
        received = timeReceived;
        severity = alertSeverity;
        observationDetails = observation;
        setStatus(AlertStatus.SUBMITTED);
    }

    //This most likely will expand and move to the future Nurse class
    public String processAlert() {
        setStatus(AlertStatus.PENDING);
        String actionTaken = new String();
        //TODO:  Determine logic to process the Alert; assume return some kind of String value
        switch(severity) {
            case ROUTINE:
                actionTaken = "Patient in Normal Levels; nothing to do here";
                break;
            case ELEVATED:
                actionTaken = "Patient exhibiting concerning stats.  Will continue to monitor";
                break;
            case CRITICAL:
                actionTaken = "Patient in critical state.  Notifying doctor!!";
                break;
        }
        setStatus(AlertStatus.RESOLVED);
        setSecondsElapsed();
        return actionTaken;
    }

    public AlertStatus getStatus()
    {
        return status;
    }

    private void setStatus(AlertStatus status)
    {
        this.status = status;
    }

    public Severity getSeverity() {
        return severity;
    }

    private void setSecondsElapsed()
    {
        secondsElapsed = 0;  //TODO:  Work out logic to determine time elapsed
    }


}
