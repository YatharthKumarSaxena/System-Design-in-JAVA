package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Parking_Ticket;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;


// DRY principle is followed
// ISP is followed
/* Interfaces (Gate, Entry_Gate_Interface, Exit_Gate_Interface) define
   specific functionalities for gate-related operations. */

public interface Entry_Gate_Interface extends Gate{
    // Extra Functionalities of Entry Gate
    Parking_Ticket generateTicket(double timeStamp, Vehicle vehicle, Parking_Slot parkingSlot);
}
