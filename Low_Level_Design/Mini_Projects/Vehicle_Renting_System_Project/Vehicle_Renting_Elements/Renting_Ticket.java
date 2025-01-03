package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

// SRP is followed

public interface Renting_Ticket {
    // Methods of Vehicle_Ticket
    int get_TicketID();
    Vehicle get_Vehicle();
    double get_disStamp();
}
