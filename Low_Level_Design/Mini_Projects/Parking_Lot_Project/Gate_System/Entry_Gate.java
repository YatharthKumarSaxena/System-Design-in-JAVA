package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;
import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public class Entry_Gate implements Entry_Gate_Interface{

    // Data Members
    private String ID;
    private Parking_Area parkingArea;

    // Parameterized Constructor
    public Entry_Gate(String ID, Parking_Area parkingArea) {
        this.ID = ID;
        this.parkingArea = parkingArea;
    }

    // Member Functions
    @Override
    public Ticket generateTicket(double timeStamp, Vehicle vehicle, Parking_Slot parkingSlot) {
        Ticket ticket = new Ticket(parkingSlot,timeStamp,vehicle);
        parkingSlot.set_Status();
        return ticket;
    }

    @Override
    public String get_ID() {
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
