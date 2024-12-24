package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

public class Slot implements Parking_Slot{

    // Data Members
    private String ID;
    private boolean status;

    // Parameterized Constructor
    public Slot(String ID) {
        this.ID = ID;
        status = true;  // Means Slot is Available to Park
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
}
