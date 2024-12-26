package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Vehicle_Slots;

public class Truck implements Vehicle{

    // Data Members
    private static int TruckID;
    private int ID;
    private String Brand;
    private int value;
    private Vehicle_Slots slot;

    // Parameterized Constructor
    public Truck(String brand,int value,Vehicle_Slots slot) {
        TruckID++;
        this.ID = TruckID;
        this.Brand = brand;
        this.value = value;
        this.slot = slot;
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
    public double getChargePerKilometers(double kilometers) {
        return kilometers*80;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Truck");
    }

    @Override
    public Vehicle_Slots get_Slot() {
        return this.slot;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
