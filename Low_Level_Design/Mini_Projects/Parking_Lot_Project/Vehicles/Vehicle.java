package Mini_Projects.Parking_Lot_Project.Vehicles;

public interface Vehicle extends Calculate_Rental_Price {
    // Methods of Vehicle
    String get_Registration_Number();
    String get_State();
    String get_Country();
    String get_Type();
}
