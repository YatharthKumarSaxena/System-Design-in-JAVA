package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;

public class Exit_Gate implements Exit_Gate_Interface{

    // Data Members
    private String ID;
    private Parking_Area parkingArea;

    // Parameterized Constructor


    public Exit_Gate(String ID, Parking_Area parkingArea) {
        this.ID = ID;
        this.parkingArea = parkingArea;
    }

    // Member Functions
    @Override
    public double generateBill(Ticket ticket) {
        double hour = ticket.get_timeStamp();
        return ticket.get_Vehicle().calculateRentalPrice(hour);
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
        System.out.println("This is an Exit Gate");
    }
}
