package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;

public interface Exit_Gate_Interface extends Gate{
    // Extra Functionalities of Exit Gate
    double generateBill(Ticket ticket);
}
