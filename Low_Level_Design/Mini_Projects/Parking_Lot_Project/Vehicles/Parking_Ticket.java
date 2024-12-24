package Mini_Projects.Parking_Lot_Project.Vehicles;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;

public interface Parking_Ticket {
    // Methods of Parking_Ticket
    int get_TicketID();
    Vehicle get_Vehicle();
    Parking_Slot get_ParkingSlot();
    double get_timeStamp();
}


