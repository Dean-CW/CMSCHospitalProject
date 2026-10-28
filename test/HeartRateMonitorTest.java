import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateMonitorTest {

    @Test
    void testReading() {
        HeartRateMonitor monitor = new HeartRateMonitor(55);
        Observation output = monitor.reading();
        assertNotNull(output);
        assertSame(output.getClass(), HeartRate.class);
        String heartRate = output.data().substring(output.data().indexOf(": ")+2);
        int bpm = Integer.parseInt(heartRate);
        assertTrue(bpm >= 30 && bpm <= 220);
    }


}