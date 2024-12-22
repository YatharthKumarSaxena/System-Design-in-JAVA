package Design_Principle;

import Design_Principle.SOLID_Design_Principle.Library_Items.Books;
import Design_Principle.SOLID_Design_Principle.Library_Items.CD;
import Design_Principle.SOLID_Design_Principle.Library_Items.DVD;
import Design_Principle.SOLID_Design_Principle.Library_Items.Library_Item;
import Design_Principle.SOLID_Design_Principle.main.LateFeeCalculate;
import Design_Principle.SOLID_Design_Principle.main.LateFeeCalculator;
import Design_Principle.SOLID_Design_Principle.main.Library;

import java.util.ArrayList;
import java.util.List;

public class LMS_System {
    public static void main(String[] args) {
        // Instantiating Objects Of Library

        Books B1 = new Books("DSA", "1", "Lafore", 500);
        Books B2 = new Books("OOPS", "2", "Robert", 700);
        System.out.println("Book B1 details are given below:- ");
        // Displaying Details of an Object
        System.out.println("Book Name :- "+B1.getTitle());
        System.out.println("Book Price :- "+B1.getValue());
        System.out.println("Book ID :- "+B1.getUniqueId());
        System.out.println("Book Author :- "+B1.getAuthor());
        CD C1 = new CD("83","1",1000,"T-Series");
        CD C2 = new CD("The Nun","2",1500,"Conjuring Cinematic Universe");
        DVD DVD1 = new DVD("DSA made Easy","1",1100,"Abhishek");
        DVD DVD2 = new DVD("OOPS in Java","2",1200,"Raghav");

        // Making an Array of Library Item
        Library_Item[] items = {B1,B2,C1,C2,DVD1,DVD2};

        // Creating Library L
        Library L = new Library(items);

        System.out.println("Total value of all items in Library = "+L.calculateTotalValue());

        // Late Fee Calculation Implementation

        LateFeeCalculator lateFeeCalculator = new LateFeeCalculator();

        // Suppose a Customer take B1,CD2 and DVD1 on rent then charge taken by LMS :-
        LateFeeCalculate[] rentItem = {B1,C2,DVD1};

        // Suppose Customer rent these items for 15 days
        System.out.println(("Amount to be paid by the user :- "+lateFeeCalculator.calculateTotalLateFees(rentItem,15)));
    }
}
