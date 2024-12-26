package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

/* Use of Factory Design Pattern */

import Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements.Vehicle_Slots;

public class VehicleFactory {
    public static Vehicle createVehicle(String type, String Brand, int value, Vehicle_Slots slot) {
        switch (type.toLowerCase()) {
            case "bike":
                return new Bike(Brand,value,slot);
            case "car":
                return new Car(Brand,value,slot);
            case "bus":
                return new Bus(Brand,value,slot);
            case "truck":
                return new Truck(Brand,value,slot);
            default:
                throw new IllegalArgumentException("Unknown Vehicle Category: " + type);
        }
    }
}
