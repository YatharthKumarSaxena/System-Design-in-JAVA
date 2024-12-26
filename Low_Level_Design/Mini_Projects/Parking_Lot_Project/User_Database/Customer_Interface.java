package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Vehicles.Parking_Ticket;

// DRY Principle is followed to minimize code redundancy
/* SRP is followed */

public interface Customer_Interface extends User{
    // Extra Methods of Customer
    Parking_Ticket get_Ticket();
}
