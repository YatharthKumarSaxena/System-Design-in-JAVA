package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_House_Interface;

public class GateFactory {
    public static Ticket_Gate createEntryGate(Renting_House_Interface rentingHouse) {
        return new Entry_Gate(rentingHouse);
    }

    public static Bill_Gate createExitGate(Renting_House_Interface rentingHouse) {
        return new Exit_Gate(rentingHouse);
    }
}
