package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Vehicles.Parking_Ticket;

/* SRP is followed */
// DRY principle is followed

public class Customer implements Customer_Interface{

    // Data Members
    private String name;
    private static int Cus_ID;
    private int ID;
    private String phoneNumber;
    private Parking_Ticket ticket;

    // Private Parameterized Constructor
    public Customer(String name, String phoneNumber , Parking_Ticket ticket) {
        this.name = name;
        Cus_ID++;
        this.ID = Cus_ID;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;
    }

    // Static Member Initialization
    static {
        Cus_ID = 0;
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
    public int get_ID() {
        return this.ID;
    }

    @Override
    public String get_phoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Parking_Ticket get_Ticket() {
        return this.ticket;
    }
}
