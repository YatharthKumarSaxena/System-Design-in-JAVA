package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public class Car implements Vehicle{

    // Data Members
    private static int CarID;
    private int ID;
    private String Brand;

    public Car(String brand) {
        CarID++;
        this.ID = CarID;
        Brand = brand;
    }

    // Static Initialization
    static{
        CarID = 0;
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
        return CarID;
    }

    @Override
    public double getChargePerKilometers(int kilometers) {
        return kilometers*50;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Car");
    }
}
