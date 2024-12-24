package Mini_Projects.Parking_Lot_Project;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Area;
import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Slot;

import java.util.List;

public class Parking_Lot_Company {

    // Data Members
    private String ID;
    private String name;
    private List<Area>Areas;

    // Parameterized Constructor
    public Parking_Lot_Company(String ID, String name, List<Area> areas) {
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

    public List<Area> getAreas() {
        return Areas;
    }

    public int getNumberOfEmptySlots(){
        int emptySlots = 0;
        for(Area A: Areas){
            emptySlots += A.getNumberOfEmptySlots();
        }
        return emptySlots;
    }

    public int getNumberOfFilledSlots(){
        int filledSlots = 0;
        for(Area A: Areas){
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
