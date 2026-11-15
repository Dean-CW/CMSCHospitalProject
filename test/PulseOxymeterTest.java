import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PulseOxymeterTest {

    @Test
    void testReading() {
        PulseOxymeter o2Monitor = new PulseOxymeter();
        Observation output = o2Monitor.reading();
        assertNotNull(output);
        assertSame(output.getClass(),O2Level.class);
        String o2 = output.data();
        double o2Level = Double.parseDouble(o2.substring(o2.indexOf(": ")+2));
        assertTrue(o2Level <= 1 && o2Level >=.78);
    }
}