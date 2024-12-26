package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_House_Interface;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_Ticket;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Ticket;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

public class Entry_Gate implements Ticket_Gate{

    // Data Members
    private int ID;
    private static int EntryGate_ID;
    private Renting_House_Interface rentingHouse;

    // Parameterized Constructor
    public Entry_Gate(Renting_House_Interface rentingHouse) {
        EntryGate_ID++;
        this.ID = EntryGate_ID;
        this.rentingHouse = rentingHouse;
    }

    // Static Member Initialization
    static {
        EntryGate_ID = 0;
    }

    // Member Functions
    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public Renting_House_Interface get_Renting_House() {
        return this.rentingHouse;
    }

    @Override
    public void displayCategory() {
        System.out.println("This is an Entry Gate");
    }

    @Override
    public Renting_Ticket generateTicket(double timeStamp, Vehicle vehicle) {
        vehicle.get_Slot().set_Status();    // Set Status of Vehicle as Unavailable
        Renting_Ticket ticket = new Ticket(timeStamp,vehicle);
        return ticket;
    }
}
