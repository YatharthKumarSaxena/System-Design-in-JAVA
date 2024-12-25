package Mini_Projects.Parking_Lot_Project;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

import java.util.List;

/* Singleton Design Pattern is Used */
/* Our Design is modelled to work for Individual Company */

// SRP is followed

/* Use of Composite Design Pattern as Parking_Lot consist of collection of Parking Area
 * This treats the collection of Parking Areas as Single Entity
 * If we have different type of Parking Areas then they are treated as Single Entity */

// Use of LSP is done here

/* If we create additional types of Parking_Area (e.g., PremiumArea, VIPArea),
* as long as they implement the Parking_Area interface, they can be added to the
* Parking_Lot_Company without breaking any existing functionality. This is a direct
* application of LSP: new types of parking areas can be substituted into the system
* without modifying the existing code. */

public class Parking_Lot_Company {

    // Data Members
    private String name;
    private List<Parking_Area> Areas;

    // Private static instance to ensure a single instance
    private static Parking_Lot_Company instance;

    // Private Constructor to prevent instantiation
    private Parking_Lot_Company(String name, List<Parking_Area> areas) {
        this.name = name;
        this.Areas = areas;
    }

    // To ensure one thread execution in order to avoid multiple instance creation
    // JAVA is a multithreaded language
    // So when two threads are trying to call the get instance method
    // We might have the multiple instances created
    // To avoid the multiple object creation at the same time synchronized keyword is used
    // Synchronized Keyword ensures that At a moment only one thread executes the whole entire method
    // This will ensure single instance creation of user database here

    // Public method to get the instance of the class
    public static synchronized Parking_Lot_Company getInstance(String name, List<Parking_Area> areas) {
        if (instance == null) {
            instance = new Parking_Lot_Company(name, areas);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public List<Parking_Area> getAreas() {
        return Areas;
    }

    public int getNumberOfEmptySlots() {
        int emptySlots = 0;
        for (Parking_Area A : Areas) {
            emptySlots += A.getNumberOfEmptySlots();
        }
        return emptySlots;
    }

    public int getNumberOfFilledSlots() {
        int filledSlots = 0;
        for (Parking_Area A : Areas) {
            filledSlots += A.getNumberOfFilledSlots();
        }
        return filledSlots;
    }

    public int getTotalSlots() {
        return this.getNumberOfFilledSlots() + this.getNumberOfEmptySlots();
    }

    public void get_Rating(){
        System.out.println("Our "+this.name+" has a rating of "+ 4.5+"/"+5);
    }
}
