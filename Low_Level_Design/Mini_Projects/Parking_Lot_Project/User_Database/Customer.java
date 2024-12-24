package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public class Customer implements Customer_Interface{

    // Data Members
    private String name;
    private String ID;
    private String phoneNumber;
    private Vehicle vehicle;
    private Ticket ticket;

    // Parameterized Constructor
    public Customer(String name, String ID, String phoneNumber, Vehicle vehicle , Ticket ticket) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.vehicle = vehicle;
        this.ticket = ticket;
    }

    // Member Functions
    @Override
    public void display_Category() {
        System.out.println("Given User is a Customer");
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

    @Override
    public Ticket get_Ticket() {
        return this.ticket;
    }
}
