package Mini_Projects.Parking_Lot_Project;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

import java.util.List;

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
    private String ID;
    private String name;
    private List<Parking_Area>Areas;

    // Parameterized Constructor
    public Parking_Lot_Company(String ID, String name, List<Parking_Area> areas) {
        this.ID = ID;
        this.name = name;
        Areas = areas;
    }

    // Member Functions
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public List<Parking_Area> getAreas() {
        return Areas;
    }

    public int getNumberOfEmptySlots(){
        int emptySlots = 0;
        for(Parking_Area A: Areas){
            emptySlots += A.getNumberOfEmptySlots();
        }
        return emptySlots;
    }

    public int getNumberOfFilledSlots(){
        int filledSlots = 0;
        for(Parking_Area A: Areas){
            filledSlots += A.getNumberOfFilledSlots();
        }
        return filledSlots;
    }

    public int getTotalSlots(){
        int totalSlot = 0;
        totalSlot = (this.getNumberOfFilledSlots() + this.getNumberOfEmptySlots());
        return totalSlot;
    }
}
