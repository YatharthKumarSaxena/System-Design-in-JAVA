package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Vehicles.Parking_Ticket;

// ISP is followed
// DRY Principle is followed
/*Interfaces (Gate, Entry_Gate_Interface, Exit_Gate_Interface) define
 specific functionalities for gate-related operations. */

public interface Exit_Gate_Interface extends Gate{
    // Extra Functionalities of Exit Gate
    double generateBill(Parking_Ticket ticket);
}
