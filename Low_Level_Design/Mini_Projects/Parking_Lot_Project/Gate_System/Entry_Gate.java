package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;
import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

// SRP is followed
// Entry_Gate handles ticket generation.

/*Dependency Inversion Principle (DIP):
 Higher-level modules (Entry_Gate and Exit_Gate) depend on abstractions (Gate interface)
 rather than concrete implementations. This makes the code flexible and easier to maintain.*/

public class Entry_Gate implements Entry_Gate_Interface{

    // Data Members
    private static int EntryGate_ID;
    private int ID;
    private Parking_Area parkingArea;

    // Parameterized Constructor
    public Entry_Gate(Parking_Area parkingArea) {
        EntryGate_ID++;
        this.ID = EntryGate_ID;
        this.parkingArea = parkingArea;
    }

    // Static Member Initialization
    static {
        EntryGate_ID = 0;
    }

    // Member Functions
    @Override
    public Ticket generateTicket(double timeStamp, Vehicle vehicle, Parking_Slot parkingSlot) {
        Ticket ticket = new Ticket(parkingSlot,timeStamp,vehicle);
        parkingSlot.set_Status();
        return ticket;
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
        System.out.println("This is an Entry Gate");
    }
}
