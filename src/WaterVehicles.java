public class WaterVehicles extends Vehicles {
    private int NoOfPropellers;
    private int DistanceOfTravel;

    public WaterVehicles() {
    }

    /*public WaterVehicles(int noOfPropellers, int distanceOfTravel) {
        NoOfPropellers = noOfPropellers;
        DistanceOfTravel = distanceOfTravel;
    }*/

    public WaterVehicles(String name, String manufacturer, int capacity, int noOfPropellers, int distanceOfTravel) {
        super(name, manufacturer, capacity);
        NoOfPropellers = noOfPropellers;
        DistanceOfTravel = distanceOfTravel;
    }

    public int getNoOfPropellers() {
        return NoOfPropellers;
    }

    public void setNoOfPropellers(int noOfPropellers) {
        NoOfPropellers = NoOfPropellers;
    }

    public int getDistanceOfTravel() {
        return DistanceOfTravel;
    }

    public void setDistanceOfTravel(int distanceOfTravel) {
        DistanceOfTravel = distanceOfTravel;
    }
}