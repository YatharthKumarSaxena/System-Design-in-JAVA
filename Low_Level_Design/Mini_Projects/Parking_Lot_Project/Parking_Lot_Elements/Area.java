package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

import java.util.List;

public class Area implements Parking_Area{

    // Data Members
    private String ID;
    private List<Slot> slots;
    private Address address;

    public Area(String ID, List<Slot> slots, Address address) {
        this.ID = ID;
        this.slots = slots;
        this.address = address;
    }

    // Member Functions
    @Override
    public String get_ID() {
        return this.ID;
    }

    @Override
    public int getNumberOfEmptySlots() {
        int emptySlots = 0;
        for(Parking_Slot slot: slots){
            if(slot.get_Status())emptySlots++;
        }
        return emptySlots;
    }

    @Override
    public int getNumberOfFilledSlots() {
        int filledSlots = 0;
        for(Parking_Slot slot: slots){
            if(!slot.get_Status())filledSlots++;
        }
        return filledSlots;
    }

    @Override
    public Address get_Address() {
        return this.address;
    }
}
