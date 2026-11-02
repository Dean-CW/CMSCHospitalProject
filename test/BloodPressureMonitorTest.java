import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BloodPressureMonitorTest {

    @Test
    void testReading() {
        BloodPressureMonitor monitor = new BloodPressureMonitor();
        Observation output = monitor.reading();
        assertNotNull(output);
        assertSame(output.getClass(),BloodPressure.class);
        String bp = output.data();
        int systolic = Integer.parseInt(bp.substring(bp.indexOf(" ")+1, bp.indexOf("/")));
        int diastolic = Integer.parseInt(bp.substring(bp.indexOf("/")+1));
        assertTrue(systolic <= 340 && systolic >=85);
        assertTrue(diastolic <= 200 && diastolic >=50);
    }
}