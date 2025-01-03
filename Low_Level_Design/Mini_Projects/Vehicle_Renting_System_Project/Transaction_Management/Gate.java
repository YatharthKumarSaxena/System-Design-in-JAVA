package Mini_Projects.Vehicle_Renting_System_Project.Transaction_Management;
import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Renting_House_Interface;

public interface Gate {

    // Methods of Gate
    int get_ID();    // A Parking Lot can have multiple Entry or Exit Gates
    Renting_House_Interface get_Renting_House();
    void displayCategory();
}
