
import java.util.Date;

public class Alert {
    private Date receivedTime;  //TODO:  This type may need to change based on implementation
    private Date resolvedTime; //TODO:  This type may need to change based on implementation
    private Severity severity;
    private AlertStatus status;
    private Observation observationDetails;

    public Alert(Observation observation, Date timeReceived) {
        receivedTime = timeReceived;
        if (observation.critical()) {
            setSeverity(Severity.CRITICAL);

        } else {
            setSeverity(Severity.ROUTINE);
        }
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
        setResolvedTime(new Date());
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

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public void setResolvedTime(Date dateTime)
    {
        setResolvedTime(dateTime);  //TODO:  Work out logic to determine time elapsed
    }


}
