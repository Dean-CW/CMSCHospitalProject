import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void getHospital() {
        Simulation sim = new Simulation();
        assertNull(sim.getHospital());
        sim.setup();
        assertTrue(sim.getHospital().getClass() == Hospital.class);
    }

    @Test
    void testSetup() {
        Simulation sim = new Simulation();
        assertNull(sim.getHospital());
        sim.setup();
        assertTrue(sim.getHospital().getClass() == Hospital.class);
    }

    @Test
    void testRun() {
        final PrintStream originalOut = System.out;
        final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        // Redirect standard out
        System.setOut(new PrintStream(outputStreamCaptor));
        Simulation sim = new Simulation();
        sim.setup();
        sim.run(2);
        String printOut = outputStreamCaptor.toString();
        int startTime = Integer.parseInt(printOut.substring(11,13));
        int endTime = Integer.parseInt(printOut.substring(41,43));
        assertEquals(2, endTime - startTime);
        // Restore original system out stream
        System.setOut(originalOut);
    }
}