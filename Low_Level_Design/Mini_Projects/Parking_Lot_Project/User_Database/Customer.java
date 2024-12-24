package Mini_Projects.Parking_Lot_Project.User_Database;

import Design_Patterns.Creational_Design_Pattern.Singleton_Design_Pattern.DataAccessLayer.UserDatabase;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public class Customer implements Customer_Interface{

    // Data Members
    private static Customer instance;
    private String name;
    private String ID;
    private String phoneNumber;
    private Ticket ticket;

    // Private Parameterized Constructor
    private Customer(String name, String ID, String phoneNumber , Ticket ticket) {
        this.name = name;
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.ticket = ticket;
    }

    // To ensure one thread execution in order to avoid multiple instance creation
    // JAVA is a multithreaded language
    // So when two threads are trying to call the get instance method
    // We might have the multiple instances created
    // To avoid the multiple object creation at the same time synchronized keyword is used
    // Synchronized Keyword ensures that At a moment only one thread executes the whole entire method
    // This will ensure single instance creation of user database here

    // Member Function
    public static synchronized Customer getInstance(String name, String ID, String phoneNumber , Ticket ticket){
        if(instance == null){
            instance = new Customer(name,ID,phoneNumber,ticket);
        }
        return instance;
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
