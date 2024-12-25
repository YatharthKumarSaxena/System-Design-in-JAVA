package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

// ISP is followed
/*Interfaces (Gate, Entry_Gate_Interface, Exit_Gate_Interface) define
 specific functionalities for gate-related operations. */

/*Template Design Pattern (Structural):

1. The Gate interface acts as a template for gate-related functionalities,
   defining common methods like get_ID(), get_ParkingArea(), and displayCategory().
2. Concrete implementations (Entry_Gate and Exit_Gate) provide specific behaviors
   for ticket generation and bill calculation, adhering to the interface's structure.*/

/* DRY Principle is followed
 Common functionality like retrieving ID and ParkingArea is encapsulated in the Gate interface
 and reused by both Entry_Gate and Exit_Gate. This prevents code duplication and ensures consistency
 */

public interface Gate {

    // Methods of Gate
    String get_ID();    // A Parking Lot can have multiple Entry or Exit Gates
    Parking_Area get_ParkingArea();
    void displayCategory();

}
