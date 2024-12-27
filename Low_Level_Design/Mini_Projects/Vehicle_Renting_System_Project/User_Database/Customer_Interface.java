package Mini_Projects.Vehicle_Renting_System_Project.User_Database;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_Ticket;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Ticket;

public interface Customer_Interface extends User{
    // Extra Methods of Customer
    Renting_Ticket get_Ticket();
}
