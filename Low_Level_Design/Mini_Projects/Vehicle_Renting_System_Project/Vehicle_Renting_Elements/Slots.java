package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

public class Slots implements Vehicle_Slots{

    // Data Members
    private static int Slot_ID;
    private int ID;
    private boolean status;

    // Parameterized Constructor
    public Slots() {
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
