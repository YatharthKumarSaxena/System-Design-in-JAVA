package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

/* Liskov Substitution Principle (LSP):
Definition: Subtypes must be substitutable for their base types.
In Area:
1. The slots list is of type Vehicle_Slots (an interface), and any implementation
of Vehicle_Slots can be used without breaking the behavior of the Renting_House class.
2. Similarly, the address is of type Address (an interface), which allows for
polymorphism and ensures LSP compliance.
*/

// In future if we make Special Slots then they come in category of Vehicle_Slot
// So We do not have to worry about calculating their empty and filled slots separately
// Example there may be special slots for Electric Vehicles
// In this way LSP helps us

public class Slot implements Vehicle_Slots{

    // Data Members
    private static int Slot_ID;
    private int ID;
    private boolean status;

    // Parameterized Constructor
    public Slot() {
        Slot_ID++;
        this.ID = Slot_ID;
        status = true;  // Means Slot is Available to Park
    }

    // Static Member Initialization
    static {
        Slot_ID = 0;
    }

    // Member Functions
    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public boolean get_Status() {
        return status;
    }

    @Override
    public void set_Status() {
        this.status = false;
    }

    @Override
    public void reset_Status() {
        this.status = true;
    }
}
