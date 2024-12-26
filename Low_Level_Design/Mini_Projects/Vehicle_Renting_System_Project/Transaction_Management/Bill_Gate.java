package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_Ticket;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Ticket;

public interface Bill_Gate extends Gate{
    // Extra Functionalities of Exit Gate
    double generateBill(Renting_Ticket ticket);
}
