package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

public class GateFactory {
    public static Gate createGate(String type, String ID, Parking_Area parkingArea) {
        switch (type.toLowerCase()) {
            case "entry":
                return new Entry_Gate(ID, parkingArea);
            case "exit":
                return new Exit_Gate(ID, parkingArea);
            default:
                throw new IllegalArgumentException("Invalid gate type: " + type);
        }
    }

}
