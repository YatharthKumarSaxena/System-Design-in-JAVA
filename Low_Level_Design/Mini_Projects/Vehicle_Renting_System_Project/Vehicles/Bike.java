package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Vehicle_Slots;

public class Bike implements Vehicle{

    // Data Members
    private static int BikeID;
    private int ID;
    private String Brand;
    private int value;
    private int chargePerKilometers;
    private Vehicle_Slots slot;

    // Parameterized Constructor
    public Bike(String brand,int value,Vehicle_Slots slot) {
        BikeID++;
        this.ID = BikeID;
        this.Brand = brand;
        this.value = value;
        this.slot = slot;
        this.chargePerKilometers = 20;
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
    public double getChargePerKilometers(double kilometers) {
        return kilometers*chargePerKilometers;
    }

    @Override
    public void setChargeAfterDiscount(double discount) {
        this.chargePerKilometers *= discount;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Bike");
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
