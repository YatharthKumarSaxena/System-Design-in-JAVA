package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

public interface Gate {

    // Methods of Gate
    String get_ID();    // A Parking Lot can have multiple Entry or Exit Gates
    Parking_Area get_ParkingArea();
    void displayCategory();

}
