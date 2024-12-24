package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

public class Slot implements Parking_Slot{

    // Data Members
    private String ID;
    private boolean status;
    private String type;

    // Parameterized Constructor
    public Slot(String ID,String type) {
        this.ID = ID;
        status = true;  // Means Slot is Available to Park
        this.type = type;   // Two/Three/Four Wheeler Type
    }

    // Member Functions
    @Override
    public String get_ID() {
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
