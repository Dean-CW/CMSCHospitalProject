import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermometerTest {

    @Test
    void testReading() {
        Thermometer therm = new Thermometer();
        Observation output = therm.reading();
        assertNotNull(output);
        assertSame(output.getClass(),Temperature.class);
        String temp = output.data();
        double o2Level = Double.parseDouble(temp.substring(temp.indexOf(": ")+2));
        assertTrue(o2Level <= 106.0 && o2Level >=82.0);
    }
}