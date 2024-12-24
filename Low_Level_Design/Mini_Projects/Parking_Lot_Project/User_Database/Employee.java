package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public class Employee implements Employee_Interface{

    // Data Members
    private static Employee instance;
    private String name;
    private String ID;
    private String phoneNumber;
    private Vehicle vehicle;
    private Parking_Slot slot;

    // Private Parametrized Constructor
    private Employee(String name, String ID, String phoneNumber, Parking_Slot slot,Vehicle vehicle) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.slot = slot;
        this.vehicle = vehicle;
        this.slot.set_Status();
    }


    // To ensure one thread execution in order to avoid multiple instance creation
    // JAVA is a multithreaded language
    // So when two threads are trying to call the get instance method
    // We might have the multiple instances created
    // To avoid the multiple object creation at the same time synchronized keyword is used
    // Synchronized Keyword ensures that At a moment only one thread executes the whole entire method
    // This will ensure single instance creation of user database here

    // Member Functions

    public static synchronized Employee getInstance(String name, String ID, String phoneNumber, Parking_Slot slot,Vehicle vehicle){
        if(instance == null){
            instance = new Employee(name,ID,phoneNumber,slot,vehicle);
        }
        return instance;
    }

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
    public String get_ID() {
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
