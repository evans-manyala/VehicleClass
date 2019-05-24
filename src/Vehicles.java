public class Vehicles {
    public String Name;
    public String Manufacturer;
    public int Capacity;

    public Vehicles() {
    }

    public Vehicles(String name, String manufacturer, int capacity) {
        Name = name;
        Manufacturer = manufacturer;
        Capacity = capacity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void printVehicleDetails(){
        System.out.println("Name is: "+getName()+"Manufacturer is: "+getManufacturer()+"Vehicle Capacity: "+getCapacity());
    }
}
