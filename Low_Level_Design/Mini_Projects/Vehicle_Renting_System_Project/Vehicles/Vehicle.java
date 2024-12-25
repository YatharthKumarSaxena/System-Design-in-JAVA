package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public interface Vehicle {
    // Methods for Vehicle
    int getID();  // Returns the unique ID of the vehicle
    String getBrand();  // Returns the brand of the vehicle (e.g., Maruti, Toyota)
    int getAvailableQuantity();  // Returns the quantity of vehicles available for rent
    double getChargePerKilometers(int kilometers);  // Returns the charge per km for renting the vehicle
    void displayVehicleCategory();
}