public class AirVehicles extends Vehicles {
    private int numberOfEngines;
    private String Type;

    public AirVehicles() {
    }

    /*public AirVehicles(int numberOfEngines, String type) {
        this.numberOfEngines = numberOfEngines;
        Type = type;
    }*/

    public AirVehicles(String name, String manufacturer, int capacity, int numberOfEngines, String type) {
        super(name, manufacturer, capacity);
        this.numberOfEngines = numberOfEngines;
        Type = type;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
