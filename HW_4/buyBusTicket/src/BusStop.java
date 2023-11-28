public class BusStop {
    private int id;
    private String name;
    private double attitude;
    private double lattitude;

 

    public BusStop(int id, String name, double attitude, double lattitude) {
        this.id = id;
        this.name = name;
        this.attitude = attitude;
        this.lattitude = lattitude;
    }

       public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttitude() {
        return attitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    

}
