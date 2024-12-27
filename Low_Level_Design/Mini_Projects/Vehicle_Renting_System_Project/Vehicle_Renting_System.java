package Mini_Projects.Vehicle_Renting_System_Project;

import Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management.Bill_Gate;
import Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management.GateFactory;
import Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management.Ticket_Gate;
import Mini_Projects.Vehicle_Renting_System_Project.User_Database.Customer;
import Mini_Projects.Vehicle_Renting_System_Project.User_Database.Customer_Interface;
import Mini_Projects.Vehicle_Renting_System_Project.User_Database.Employee;
import Mini_Projects.Vehicle_Renting_System_Project.User_Database.Employee_Interface;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.*;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Vehicle_Renting_System {
    public static void main(String[] args) {
        System.out.println();

        // Initializing Parking Slots
        Vehicle_Slots slot1 = new Slot();
        Vehicle_Slots slot2 = new Slot();
        Vehicle_Slots slot3 = new Slot();
        Vehicle_Slots slot4 = new Slot();

        // Creating Vehicles Using the Factory
        Vehicle B1 = VehicleFactory.createVehicle("bike","Honda",90000,slot1);
        Vehicle C1 = VehicleFactory.createVehicle("car", "Maruti", 600000,slot2);
        Vehicle T1 = VehicleFactory.createVehicle("truck", "Tata Ultra",1500000,slot3);
        Vehicle A1 = VehicleFactory.createVehicle("bus", "Ashok Leyland Cheetah", 2000000, slot4);

        System.out.println("Vehicle Slots ID :- ");
        System.out.println("ID for slot1 :- "+slot1.get_ID());
        System.out.println("ID for slot2 :- "+slot2.get_ID());
        System.out.println("ID for slot3 :- "+slot3.get_ID());
        System.out.println("ID for slot4 :- "+slot4.get_ID());
        System.out.println();

        // Initializing Parking Address
        Address AD1 = new Address_Of_Renting_House("Washington Point","202111","Washington,DC","","USA");
        Address AD2 = new Address_Of_Renting_House("Holkar Chaurah, Sasni Gate","202001","Aligarh","Uttar Pradesh","India");

        System.out.println("Addresses ID :- ");
        System.out.println("ID for Address1 :- "+AD1.get_ID());
        System.out.println("ID for Address2 :- "+AD2.get_ID());
        System.out.println();

        // Making List of Parking Slots
        List<Vehicle_Slots> slots1 = new ArrayList<>();
        List<Vehicle_Slots> slots2 = new ArrayList<>();
        slots1.add(slot1);
        slots1.add(slot4);
        slots2.add(slot2);
        slots2.add(slot3);

        // Initializing Parking Area
        Renting_House_Interface area1 = new Renting_House(slots1,AD1);
        Renting_House_Interface area2 = new Renting_House(slots2,AD2);

        System.out.println("Renting House Areas ID :- ");
        System.out.println("ID for area1 :- "+area1.get_ID());
        System.out.println("ID for area2 :- "+area2.get_ID());
        System.out.println();

        // Initializing List of Areas
        List<Renting_House_Interface> areas = new ArrayList<>();
        areas.add(area1);
        areas.add(area2);

        // Initializing Parking_Lot_Company
        Vehicle_Renting_Company P = Vehicle_Renting_Company.getInstance("EasyRent",areas);

        System.out.println("Status After Initializing Slots :- ");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Entry Gates
        Ticket_Gate EnGate1 = GateFactory.createEntryGate(area1);
        Ticket_Gate EnGate2 = GateFactory.createEntryGate(area2);

        System.out.println("Entry_Gates ID :- ");
        System.out.println("ID for EnGate1 :- "+EnGate1.get_ID());
        System.out.println("ID for EnGate2 :- "+EnGate2.get_ID());
        System.out.println();

        // Initializing Customer Tickets
        Renting_Ticket t2 = EnGate2.generateTicket(10,C1);
        Renting_Ticket t3 = EnGate2.generateTicket(10,T1);
        Renting_Ticket t4 = EnGate2.generateTicket(10,A1);

        System.out.println("Ticket ID for each ticket "+"Ticket2 = "+t2.get_TicketID());
        System.out.println("Ticket ID for each ticket "+"Ticket3 = "+t3.get_TicketID());
        System.out.println("Ticket ID for each ticket "+"Ticket4 = "+t4.get_TicketID());
        System.out.println();

        System.out.println("Status After Initializing Tickets");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        // Initializing Users

        // Initialized Employee Without Ticket (As Slots are Reserved for them)
        Employee_Interface user1 = new Employee("Yatharth Kumar Saxena","5632451290");
        // Initialized Customers by their tickets
        Customer_Interface user2 = new Customer("Abhishek Varshney","9876452312",t2);
        Customer_Interface user3 = new Customer("Oliver Johnson","8945273412",t3);
        Customer_Interface user4 = new Customer("Liam Smith","9812541109",t4);

        // Initializing the VIP Ticket
        Renting_Ticket ticket1 = new VIP_Ticket(10,B1,user1);

        System.out.println("VIP Ticket ID for each ticket "+"Ticket1 = "+ticket1.get_TicketID());
        System.out.println();

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
        Bill_Gate ExGate1 = GateFactory.createExitGate(area1);
        Bill_Gate ExGate2 = GateFactory.createExitGate(area2);

        System.out.println("Exit_Gates ID :- ");
        System.out.println("ID for ExGate1 :- "+ExGate1.get_ID());
        System.out.println("ID for ExGate2 :- "+ExGate2.get_ID());
        System.out.println();

        // Generating Bills for each Customer
        double Bill1 = ExGate1.generateBill(ticket1);
        double Bill2 = ExGate2.generateBill(t3);
        double Bill3 = ExGate2.generateBill(t4);
        double Bill4 = ExGate1.generateBill(t4);

        System.out.println("Status after generating Bill of Customers");
        System.out.println("Total number of Empty Slots in "+P.getName()+" = "+P.getNumberOfEmptySlots());
        System.out.println("Total number of Filled Slots in "+P.getName()+" = "+P.getNumberOfFilledSlots());
        System.out.println("Total number of Slots in "+P.getName()+" = "+P.getTotalSlots());
        System.out.println();

        System.out.println("Bill generated for each customer given below");
        System.out.println("Amount paid by "+user1.get_Name()+" = "+Bill1);
        System.out.println("Amount paid by "+user2.get_Name()+" = "+Bill2);
        System.out.println("Amount paid by "+user3.get_Name()+" = "+Bill3);
        System.out.println("Amount paid by "+user4.get_Name()+" = "+Bill4);
        System.out.println();

        P.get_Rating();
    }
}
