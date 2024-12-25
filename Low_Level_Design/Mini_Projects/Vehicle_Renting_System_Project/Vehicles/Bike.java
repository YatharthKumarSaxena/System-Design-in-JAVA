package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public class Bike implements Vehicle{

    // Data Members
    private static int BikeID;
    private int ID;
    private String Brand;

    public Bike(String brand) {
        BikeID++;
        this.ID = BikeID;
        Brand = brand;
    }

    // Static Initialization
    static{
        BikeID = 0;
    }

    // Member Functions
    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public String getBrand() {
        return this.Brand;
    }

    @Override
    public int getAvailableQuantity() {
        return BikeID;
    }

    @Override
    public double getChargePerKilometers(int kilometers) {
        return kilometers*20;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Bike");
    }
}
