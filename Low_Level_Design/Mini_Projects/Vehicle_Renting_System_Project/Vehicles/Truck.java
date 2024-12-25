package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public class Truck implements Vehicle{

    // Data Members
    private static int TruckID;
    private int ID;
    private String Brand;

    public Truck(String brand) {
        TruckID++;
        this.ID = TruckID;
        Brand = brand;
    }

    // Static Initialization
    static{
        TruckID = 0;
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
        return TruckID;
    }

    @Override
    public double getChargePerKilometers(int kilometers) {
        return kilometers*80;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Truck");
    }
}
