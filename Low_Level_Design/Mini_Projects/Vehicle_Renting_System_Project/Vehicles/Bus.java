package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public class Bus implements Vehicle{

    // Data Members
    private static int BusID;
    private int ID;
    private String Brand;

    public Bus(String brand) {
        BusID++;
        this.ID = BusID;
        Brand = brand;
    }

    // Static Initialization
    static{
        BusID = 0;
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
        return BusID;
    }

    @Override
    public double getChargePerKilometers(int kilometers) {
        return kilometers*100;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Bus");
    }
}
