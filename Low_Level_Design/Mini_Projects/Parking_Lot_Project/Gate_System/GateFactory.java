package Mini_Projects.Parking_Lot_Project.Gate_System;

import Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements.Parking_Area;

public class GateFactory {
    public static Entry_Gate_Interface createEntryGate(Parking_Area parkingArea) {
        return new Entry_Gate(parkingArea);
    }

    public static Exit_Gate_Interface createExitGate(Parking_Area parkingArea) {
        return new Exit_Gate(parkingArea);
    }
}

