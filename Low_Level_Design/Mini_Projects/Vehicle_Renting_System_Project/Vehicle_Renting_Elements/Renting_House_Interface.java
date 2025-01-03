package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

import java.util.List;

public interface Renting_House_Interface {
    // Methods of Renting_House_Interface
    int get_ID();
    List<Vehicle> getVehicles();
    int getNumberOfEmptySlots();
    int getNumberOfFilledSlots();
    Address get_Address();
    int getValue();
}
