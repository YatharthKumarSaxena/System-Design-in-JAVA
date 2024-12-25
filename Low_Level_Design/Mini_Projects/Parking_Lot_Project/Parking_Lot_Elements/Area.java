package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

import java.util.List;

/* Liskov Substitution Principle (LSP):
Definition: Subtypes must be substitutable for their base types.
In Area:
1. The slots list is of type Parking_Slot (an interface), and any implementation
of Parking_Slot can be used without breaking the behavior of the Area class.
2. Similarly, the address is of type Address (an interface), which allows for
polymorphism and ensures LSP compliance.
*/

/* Use of Composite Design Pattern as Area consist of collection of Parking Slots
* This treats the collection of slot as Single Entity
* If we have different type of Parking Slots then they are treated as Single Entity */

public class Area implements Parking_Area{

    // Data Members
    private String ID;
    // In future if we make Special Slots then they come in category of Parking_Slot
    // So We do not have to worry about calculating their empty and filled slots separately
    // Example there may be special slots for Electric Vehicles
    // In this way LSP helps us
    private List<Parking_Slot> slots;
    private Address address;

    public Area(String ID, List<Parking_Slot> slots, Address address) {
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
