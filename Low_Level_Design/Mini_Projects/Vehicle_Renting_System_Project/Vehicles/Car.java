package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Vehicle_Slots;

public class Car implements Vehicle{

    // Data Members
    private static int CarID;
    private int ID;
    private String Brand;
    private int value;
    private Vehicle_Slots slot;

    // Parameterized Constructor
    public Car(String brand,int value,Vehicle_Slots slot) {
        CarID++;
        this.ID = CarID;
        this.Brand = brand;
        this.value = value;
        this.slot = slot;
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
    public double getChargePerKilometers(double kilometers) {
        return kilometers*50;
    }

    @Override
    public void displayVehicleCategory() {
        System.out.println("Vehicle Category is Car");
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
