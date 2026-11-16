public class Nurses {
    private Nurses[] availableNurses = new Nurses[50]; //replace with a queue of available nurses
    private Nurses[] assignedNurses = new Nurses[50]; //replace with a queue of assigned nurses

        public void assignToNurse(Alert alert) {
        //If there is an urgent alert in the queue, assign a nurse to it. If there are no urgent alerts, assign a nurse to the next routine alert in the queue.
    }

    public void releaseNurse(Nurses nurse) {
        //Release the nurse from the assigned queue and add them back to the available queue
    }

    public Nurses[] getAssignedNurses() {
        return assignedNurses;
    }

    public Nurses[] getAvailableNurses() {
        return availableNurses;
    }
}
