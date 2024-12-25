package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;

// SRP is followed
// Exit_Gate handles billing

/*Dependency Inversion Principle (DIP):
 Higher-level modules (Entry_Gate and Exit_Gate) depend on abstractions (Gate interface)
 rather than concrete implementations. This makes the code flexible and easier to maintain.*/

public class Exit_Gate implements Exit_Gate_Interface{

    // Data Members
    private int ID;
    private static int ExitGate_ID;
    private Parking_Area parkingArea;

    // Parameterized Constructor


    public Exit_Gate(Parking_Area parkingArea) {
        ExitGate_ID++;
        this.ID = ExitGate_ID;
        this.parkingArea = parkingArea;
    }

    // Static Member Initialization
    static {
        ExitGate_ID = 0;
    }

    // Member Functions
    @Override
    public double generateBill(Ticket ticket) {
        double hour = ticket.get_timeStamp();
        ticket.get_ParkingSlot().reset_Status();
        return ticket.get_Vehicle().calculateRentalPrice(hour);
    }

    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public Parking_Area get_ParkingArea() {
        return this.parkingArea;
    }

    @Override
    public void displayCategory() {
        System.out.println("This is an Exit Gate");
    }
}
