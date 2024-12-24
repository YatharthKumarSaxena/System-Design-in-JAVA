package Mini_Projects.Parking_Lot_Project.Vehicles;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;

public class Ticket implements Parking_Ticket{

    // Data Members
    private static int ticketID;
    private Parking_Slot slot;
    private double timeStamp;
    private Vehicle vehicle;

    // Static Member Initialization
    static {
        ticketID = 1;
    }

    // Parameterized Constructor
    public Ticket(Parking_Slot slot,double timeStamp,Vehicle vehicle) {
        ticketID++;
        this.slot = slot;
        this.timeStamp = timeStamp;
        this.vehicle = vehicle;
    }

    // Member Functions
    @Override
    public int get_TicketID() {
        return ticketID;
    }

    @Override
    public Vehicle get_Vehicle() {
        return vehicle;
    }

    @Override
    public Parking_Slot get_ParkingSlot() {
        return this.slot;
    }

    @Override
    public double get_timeStamp() {
        return this.timeStamp;
    }
}
