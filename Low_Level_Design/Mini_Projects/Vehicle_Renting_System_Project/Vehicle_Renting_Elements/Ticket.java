package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

public class Ticket implements Renting_Ticket{

    // Data Members
    private static int ticketID;
    private int ID;
    private double timeStamp;
    private Vehicle vehicle;


    // Static Member Initialization
    static {
        ticketID = 0;
    }

    // Parameterized Constructor
    public Ticket(double disStamp, Vehicle vehicle) {
        ticketID++;
        this.ID = ticketID;
        this.timeStamp = timeStamp;
        this.vehicle = vehicle;
    }

    // Member Functions
    @Override
    public int get_TicketID() {
        return ID;
    }

    @Override
    public Vehicle get_Vehicle() {
        return vehicle;
    }

    @Override
    public double get_disStamp() {
        return this.timeStamp;
    }
}
