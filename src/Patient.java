public class Patient {
    private Integer id = new Integer(); //TODO

    public int getId() {
        return id;
    }
    public String toString(){
        return "I am patient " + id;
    }

    public Patient(){
        id = 1;//TODO
    }
}
