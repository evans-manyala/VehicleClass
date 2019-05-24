public class LandVehicles extends Vehicles {
    private int NumberOfWheels;
    private String FuelType;
    private String vehiclePurpose;

    public LandVehicles() {
    }

   /* public LandVehicles(int numberOfWheels, String fuelType, String vehiclePurpose) {
        NumberOfWheels = numberOfWheels;
        FuelType = fuelType;
        this.vehiclePurpose = vehiclePurpose;
    }*/

    public LandVehicles(String name, String manufacturer, int capacity, int numberOfWheels, String fuelType, String vehiclePurpose) {
        super(name, manufacturer, capacity);
        NumberOfWheels = numberOfWheels;
        FuelType = fuelType;
        this.vehiclePurpose = vehiclePurpose;
    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public String getVehiclePurpose() {
        return vehiclePurpose;
    }

    public void setVehiclePurpose(String vehiclePurpose) {
        this.vehiclePurpose = vehiclePurpose;
    }

    @Override
    public void printVehicleDetails() {
        super.printVehicleDetails();
            System.out.println("Type is:"+LandVehicles.class.getName()+"Name is:"+getName()+"Number of wheels is:"+getNumberOfWheels()+"Fuel Type: "+getFuelType() );
        }
}
