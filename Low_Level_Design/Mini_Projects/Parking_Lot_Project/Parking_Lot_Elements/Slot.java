package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

public class Slot implements Parking_Slot{

    // Data Members
    private static int Slot_ID;
    private int ID;
    private boolean status;
    private String type;

    // Parameterized Constructor
    public Slot(String type) {
        Slot_ID++;
        this.ID = Slot_ID;
        status = true;  // Means Slot is Available to Park
        this.type = type;   // Two/Three/Four Wheeler Type
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
    public String get_Type() {
        return this.type;
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
