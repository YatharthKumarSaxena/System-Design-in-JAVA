package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public interface Entry_Gate_Interface extends Gate{
    // Extra Functionalities of Entry Gate
    Ticket generateTicket(double timeStamp, Vehicle vehicle, Parking_Slot parkingSlot);
}
