package Mini_Projects.Parking_Lot_Project;


import Mini_Projects.Parking_Lot_Project.Gate_System.*;
import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.*;
import Mini_Projects.Parking_Lot_Project.User_Database.Customer;
import Mini_Projects.Parking_Lot_Project.User_Database.Employee;
import Mini_Projects.Parking_Lot_Project.Vehicles.*;

import java.util.ArrayList;
import java.util.List;

/* Use of Factory Design Pattern in Vehicle And Gate*/
// LSP Principle Implementation

public class Parking_Lot_Management_System {
    public static void main(String[] args) {
        System.out.println();

        // Creating Vehicles Using the Factory
        Vehicle B1 = VehicleFactory.createVehicle("bike", "UP81BH9263", "Uttar Pradesh", "India");
        Vehicle C1 = VehicleFactory.createVehicle("car", "AZM5691", "Washington, DC", "USA");
        Vehicle C2 = VehicleFactory.createVehicle("car", "AZM9591", "Washington, DC", "USA");
        Vehicle A1 = VehicleFactory.createVehicle("auto", "MP0M9591", "Madhya Pradesh", "India");

        // Initializing Parking Slots
        Parking_Slot slot1 = new Slot( B1.get_Type());
        Parking_Slot slot2 = new Slot( C1.get_Type());
        Parking_Slot slot3 = new Slot( C2.get_Type());
        Parking_Slot slot4 = new Slot( A1.get_Type());

        System.out.println("Slots ID :- ");
        System.out.println("ID for slot1 :- "+slot1.get_ID());
        System.out.println("ID for slot2 :- "+slot2.get_ID());
        System.out.println("ID for slot3 :- "+slot3.get_ID());
        System.out.println("ID for slot4 :- "+slot4.get_ID());
        System.out.println();

        // Initializing Parking Address
        Address AD1 = new Address_Of_Parking_Area("Washington Point","202111","Washington,DC","","USA");
        Address AD2 = new Address_Of_Parking_Area("Holkar Chaurah, Sasni Gate","202001","Aligarh","Uttar Pradesh","India");

        System.out.println("Addresses ID :- ");
        System.out.println("ID for Address1 :- "+AD1.get_ID());
        System.out.println("ID for Address2 :- "+AD2.get_ID());
        System.out.println();

        // Making List of Parking Slots
        List<Parking_Slot> slots1 = new ArrayList<>();
        List<Parking_Slot> slots2 = new ArrayList<>();
        slots1.add(slot1);
        slots1.add(slot4);
        slots2.add(slot2);
        slots2.add(slot3);

        // Initializing Parking Area
        Parking_Area area1 = new Area(slots1,AD2);
        Parking_Area area2 = new Area(slots2,AD1);

        System.out.println("Parking Areas ID :- ");
        System.out.println("ID for area1 :- "+area1.get_ID());
        System.out.println("ID for area2 :- "+area2.get_ID());
        System.out.println();

        // Initializing List of Areas
        List<Parking_Area> areas = new ArrayList<>();
        areas.add(area1);
        areas.add(area2);

        // Initializing Parking_Lot_Company
        Parking_Lot_Company P = Parking_Lot_Company.getInstance("EasyPark",areas);

        System.out.println("Status After Initializing Slots :- ");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Entry Gates
        Entry_Gate_Interface EnGate1 = GateFactory.createEntryGate(area1);
        Entry_Gate_Interface EnGate2 = GateFactory.createEntryGate(area2);

        System.out.println("Entry_Gates ID :- ");
        System.out.println("ID for EnGate1 :- "+EnGate1.get_ID());
        System.out.println("ID for EnGate2 :- "+EnGate2.get_ID());
        System.out.println();

        // Initializing Tickets
        Ticket t1 = EnGate1.generateTicket(10,A1,slot4);
        Ticket t2 = EnGate2.generateTicket(10,C1,slot2);
        Ticket t3 = EnGate2.generateTicket(10,C2,slot3);

        System.out.println("Ticket ID for each ticket "+"Ticket1 = "+t1.get_TicketID());
        System.out.println("Ticket ID for each ticket "+"Ticket2 = "+t2.get_TicketID());
        System.out.println("Ticket ID for each ticket "+"Ticket3 = "+t3.get_TicketID());
        System.out.println();

        System.out.println("Status After Initializing Tickets");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Users

        // Initialized Employee Without Ticket (As Slots are Reserved for them)
        Employee user1 = new Employee("Yatharth Kumar Saxena","5632451290",slot1,B1);
        // Initialized Customers by their tickets
        Customer user2 = new Customer("Abhishek Varshney","9876452312",t1);
        Customer user3 = new Customer("Oliver Johnson","8945273412",t2);
        Customer user4 = new Customer("Liam Smith","9812541109",t3);

        System.out.println("Status After Initializing Users especially an Employee");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        user2.display_Category();
        System.out.println("ID for user2 :- "+user2.get_ID());
        System.out.println("ID for user3 :- "+user3.get_ID());
        System.out.println("ID for user4 :- "+user4.get_ID());
        user1.display_Category();
        System.out.println("ID for user1 :- "+user1.get_ID());
        System.out.println();

        // Initializing Exit Gates
        Exit_Gate_Interface ExGate1 = GateFactory.createExitGate(area1);
        Exit_Gate_Interface ExGate2 = GateFactory.createExitGate(area2);

        System.out.println("Exit_Gates ID :- ");
        System.out.println("ID for ExGate1 :- "+ExGate1.get_ID());
        System.out.println("ID for ExGate2 :- "+ExGate2.get_ID());
        System.out.println();

        // Generating Bills for each Customer
        double Bill1 = ExGate1.generateBill(t1);
        double Bill2 = ExGate2.generateBill(t2);
        double Bill3 = ExGate2.generateBill(t3);

        System.out.println("Status after generating Bill of Customers");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        System.out.println("Bill generated for each customer given below");
        System.out.println("Amount paid by "+user2.get_Name()+" = "+Bill1);
        System.out.println("Amount paid by "+user3.get_Name()+" = "+Bill2);
        System.out.println("Amount paid by "+user4.get_Name()+" = "+Bill3);
        System.out.println();

        P.get_Rating();
    }
}
