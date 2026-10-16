import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Simulation {

    private Hospital hospital;
    private Date baseDate = new Date();
    private Calendar calendar = Calendar.getInstance();
    private Random rand;

    public Simulation() {
       // No-op
    }

    private int getRandomNumber() {
        return rand.nextInt();
    }

    public Hospital getHospital()
    {
        return hospital;
    }

    public void setup() {
        //TODO:  read max beds property from parameters file
        hospital = new Hospital();
        rand = new Random();
    }

    public void run(int hoursToRun) {
        calendar.setTime(baseDate);
        int totalIterations = (hoursToRun * 60) / 10;
        System.out.println(calendar.getTime()); //Temporary logic to verify increment
        for (int i = 0; i <= totalIterations; i++) {
            calendar.add(Calendar.MINUTE, 10); // Increments by 10 minutes
            //TODO:  execute logic of the simulation that is to occur every 10 minutes
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
