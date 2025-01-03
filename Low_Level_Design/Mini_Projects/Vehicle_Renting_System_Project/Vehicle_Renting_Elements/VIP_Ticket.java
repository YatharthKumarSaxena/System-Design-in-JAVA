package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

import Mini_Projects.Vehicle_Renting_System_Project.User_Database.Employee_Interface;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

// SRP is followed

public class VIP_Ticket implements Renting_Ticket{

    // Data Members
    private int ID;
    private static int VIP_Ticket_ID;
    private Vehicle vehicle;
    private double disStamp;
    private Employee_Interface employee;

    // Parametrized Constructor
    public VIP_Ticket(double disStamp,Vehicle vehicle,Employee_Interface employee) {
        VIP_Ticket_ID++;
        this.disStamp = disStamp;
        this.vehicle = vehicle;
        this.ID = VIP_Ticket_ID;
        this.vehicle.get_Slot().set_Status();       // Make Vehicle Unavailable
        double discount = employee.get_Discount_On_Rent();
        this.vehicle.setChargeAfterDiscount(discount);
    }

    static {
        VIP_Ticket_ID = 0;
    }

    // Member Functions
    @Override
    public int get_TicketID() {
        return this.ID;
    }

    @Override
    public Vehicle get_Vehicle() {
        return this.vehicle;
    }

    @Override
    public double get_disStamp() {
        return this.disStamp;
    }

}
