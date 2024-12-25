package Mini_Projects.Parking_Lot_Project.Vehicles;

// SRP is followed
// Use of Interface Segregation Principle , Interface is made not much fat
// This is done in order to ensure Single Responsibility Principe
// This interface holds responsibility of displaying vehicle details

public interface Vehicle extends Calculate_Rental_Price {
    // Methods of Vehicle
    String get_Registration_Number();
    String get_State();
    String get_Country();
    String get_Type();
}
