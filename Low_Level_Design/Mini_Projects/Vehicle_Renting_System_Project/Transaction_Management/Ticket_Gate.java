package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_Ticket;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

public interface Ticket_Gate extends Gate{
    // Extra Functionalities of Entry Gate
    Renting_Ticket generateTicket(double timeStamp, Vehicle vehicle);
}
