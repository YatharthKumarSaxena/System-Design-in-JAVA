package Mini_Projects.Parking_Lot_Project.User_Database;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Slot;
import Mini_Projects.Parking_Lot_Project.Vehicles.Vehicle;

public interface Employee_Interface extends User{
    // Extra Methods of Employee
    Parking_Slot get_Slot();    // Employee Have Reserved Parking Slots
    Vehicle get_Vehicle();
}
