import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AlertTest {


    @Test
    void testProcessCriticalAlert() {
        Alert alert = new Alert(null, new Date(), Severity.CRITICAL);
        assertEquals(AlertStatus.SUBMITTED, alert.getStatus());
        assertEquals("Patient in critical state.  Notifying doctor!!", alert.processAlert());
        assertEquals(AlertStatus.RESOLVED, alert.getStatus());
    }

    @Test
    void testProcessRoutineAlert() {
        Alert alert = new Alert(null, new Date(), Severity.ROUTINE);
        assertEquals(AlertStatus.SUBMITTED, alert.getStatus());
        assertEquals("Patient in Normal Levels; nothing to do here", alert.processAlert());
        assertEquals(AlertStatus.RESOLVED, alert.getStatus());
    }

    @Test
    void testGetStatus() {
        Alert alert = new Alert(null, new Date(), Severity.ROUTINE);
        assertEquals(AlertStatus.SUBMITTED, alert.getStatus());
    }

    @Test
    void testGetSeverity() {
        Alert alert = new Alert(null, new Date(), Severity.ROUTINE);
        assertEquals(Severity.ROUTINE, alert.getSeverity());
    }
}