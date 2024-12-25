package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;

/* SRP is followed */
// DRY principle is followed

public class Customer implements Customer_Interface{

    // Data Members
    private String name;
    private String ID;
    private String phoneNumber;
    private Ticket ticket;

    // Private Parameterized Constructor
    public Customer(String name, String ID, String phoneNumber , Ticket ticket) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
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
    public String get_phoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Ticket get_Ticket() {
        return this.ticket;
    }
}
