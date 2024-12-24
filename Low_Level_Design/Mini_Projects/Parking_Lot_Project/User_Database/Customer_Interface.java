package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Vehicles.Ticket;

public interface Customer_Interface extends User{
    // Extra Methods of Customer
    Ticket get_Ticket();
}
