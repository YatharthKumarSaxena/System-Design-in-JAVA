package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Vehicle_Slots;

// SRP is followed
// Use of Interface Segregation Principle , Interface is made not much fat
// This is done in order to ensure Single Responsibility Principe
// This interface holds responsibility of displaying vehicle details

public interface Vehicle extends ChargeRent{
    // Methods for Vehicle
    int getID();  // Returns the unique ID of the vehicle
    String getBrand();  // Returns the brand of the vehicle (e.g., Maruti, Toyota)
    int getValue();
    void displayVehicleCategory();
    Vehicle_Slots get_Slot();
}