package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_House_Interface;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_Ticket;

public class Exit_Gate implements Bill_Gate{

    // Data Members
    private int ID;
    private static int ExitGate_ID;
    private Renting_House_Interface rentingHouse;

    // Parameterized Constructor
    public Exit_Gate(Renting_House_Interface rentingHouse) {
        ExitGate_ID++;
        this.ID = ExitGate_ID;
        this.rentingHouse = rentingHouse;
    }

    // Static Member Initialization
    static {
        ExitGate_ID = 0;
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
        System.out.println("This is an Exit Gate");
    }

    @Override
    public double generateBill(Renting_Ticket ticket) {
        double distance = ticket.get_disStamp();
        double rent = ticket.get_Vehicle().getChargePerKilometers(distance);
        return rent;
    }
}
