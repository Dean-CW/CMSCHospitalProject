import java.util.Calendar;
import java.util.Date;

public class Simulation {

    private Hospital hospital;
    private Date baseDate = new Date();
    private Calendar calendar = Calendar.getInstance();

    public Simulation() {
       // No-op
    }

    public Hospital getHospital()
    {
        return hospital;
    }

    public void setup() {
        //TODO:  read max beds property from parameters file
        hospital = new Hospital(150);
    }

    public void run(int hoursToRun) {
        calendar.setTime(baseDate);
        int totalIterations = (hoursToRun * 60) / 10;
        System.out.println(calendar.getTime()); //Temporary logic to verify increment
        for (int i = 0; i <= totalIterations; i++) {
            calendar.add(Calendar.MINUTE, 10); // Increments by 10 minutes
            hospital.readPatientDevices(calendar.getTime());
            hospital.assignAlerts();
            hospital.resolveAlerts(calendar);
        }
        System.out.println(calendar.getTime()); //Temporary logic to verify increment

    }

    private void process() {}

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        int hoursToRun;

        if (args.length > 0 && Integer.getInteger(args[0]) > 0)
        {
            hoursToRun = Integer.getInteger(args[0]);
        } else {
            hoursToRun = 2; //default to two
        }
        sim.setup();
        sim.run(hoursToRun);
        sim.process();

    }
}
