package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

/* SRP is followed */
// DRY principle is followed

public class Employee implements Employee_Interface{

    // Data Members
    private static int User_ID;
    private String name;
    private int ID;
    private String phoneNumber;
    private Vehicle vehicle;
    private Parking_Slot slot;

    // Private Parametrized Constructor
    public Employee(String name, String phoneNumber, Parking_Slot slot,Vehicle vehicle) {
        this.name = name;
        User_ID++;
        this.ID = User_ID;
        this.phoneNumber = phoneNumber;
        this.slot = slot;
        this.vehicle = vehicle;
        this.slot.set_Status();
    }

    // Static Member Initialization
    static {
        User_ID = 0;
    }

    // Member Functions

    @Override
    public Parking_Slot get_Slot() {
        return this.slot;
    }

    @Override
    public void display_Category() {
        System.out.println("Given User is an Employee");
    }

    @Override
    public String get_Name() {
        return this.name;
    }

    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public Vehicle get_Vehicle() {
        return this.vehicle;
    }

    @Override
    public String get_phoneNumber() {
        return this.phoneNumber;
    }
}
