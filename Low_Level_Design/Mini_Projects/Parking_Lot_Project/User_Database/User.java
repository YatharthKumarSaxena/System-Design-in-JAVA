package Mini_Projects.Parking_Lot_Project.User_Database;

// This interface helps in implementing customer and employee interface
// DRY Principle is followed to minimize code redundancy
/* SRP is followed */

public interface User {
    // Methods of User
    void display_Category();
    String get_Name();
    String get_ID();
    String get_phoneNumber();
}
