package Mini_Projects.Parking_Lot_Project;


import Mini_Projects.Parking_Lot_Project.Gate_System.Entry_Gate;
import Mini_Projects.Parking_Lot_Project.Gate_System.Exit_Gate;
import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.*;
import Mini_Projects.Parking_Lot_Project.User_Database.Customer;
import Mini_Projects.Parking_Lot_Project.User_Database.Employee;
import Mini_Projects.Parking_Lot_Project.Vehicles.*;

import java.util.ArrayList;
import java.util.List;

/* Use of Factory Design Pattern */
// LSP Principle Implementation

public class Parking_Lot_Management_System {
    public static void main(String[] args) {

        // Creating Vehicles Using the Factory
        Vehicle B1 = VehicleFactory.createVehicle("bike", "UP81BH9263", "Uttar Pradesh", "India");
        Vehicle C1 = VehicleFactory.createVehicle("car", "AZM5691", "Washington, DC", "USA");
        Vehicle C2 = VehicleFactory.createVehicle("car", "AZM9591", "Washington, DC", "USA");
        Vehicle A1 = VehicleFactory.createVehicle("auto", "MP0M9591", "Madhya Pradesh", "India");

        // Initializing Parking Slots
        Parking_Slot slot1 = new Slot("1", B1.get_Type());
        Parking_Slot slot2 = new Slot("2", C1.get_Type());
        Parking_Slot slot3 = new Slot("3", C2.get_Type());
        Parking_Slot slot4 = new Slot("4", A1.get_Type());

        // Initializing Parking Address
        Address AD1 = new Address_Of_Parking_Area("1","Washington Point","202111","Washington,DC","","USA");
        Address AD2 = new Address_Of_Parking_Area("2","Holkar Chaurah, Sasni Gate","202001","Aligarh","Uttar Pradesh","India");

        // Making List of Parking Slots
        List<Parking_Slot> slots1 = new ArrayList<>();
        List<Parking_Slot> slots2 = new ArrayList<>();
        slots1.add(slot1);
        slots1.add(slot4);
        slots2.add(slot2);
        slots2.add(slot3);

        // Initializing Parking Area
        Parking_Area area1 = new Area("1",slots1,AD2);
        Parking_Area area2 = new Area("2",slots2,AD1);

        // Initializing List of Areas
        List<Parking_Area> areas = new ArrayList<>();
        areas.add(area1);
        areas.add(area2);

        // Initializing Parking_Lot_Company
        Parking_Lot_Company P = new Parking_Lot_Company("1","EasyPark",areas);

        System.out.println("Status After Initializing Slots :- ");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Entry Gates
        Entry_Gate EnGate1 = new Entry_Gate("1",area1);
        Entry_Gate EnGate2 = new Entry_Gate("2",area2);

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
        Employee user1 = new Employee("Yatharth Kumar Saxena","1","5632451290",slot1,B1);
        // Initialized Customers by their tickets
        Customer user2 = new Customer("Abhishek Varshney","2","9876452312",t1);
        Customer user3 = new Customer("Oliver Johnson","3","8945273412",t2);
        Customer user4 = new Customer("Liam Smith","4","9812541109",t3);

        System.out.println("Status After Initializing Users especially an Employee");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Exit Gates
        Exit_Gate ExGate1 = new Exit_Gate("1",area1);
        Exit_Gate ExGate2 = new Exit_Gate("2",area2);

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
    }
}
