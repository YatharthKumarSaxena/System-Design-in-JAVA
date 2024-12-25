package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

/* Use of Factory Design Pattern */

public class VehicleFactory {
    public static Vehicle createVehicle(String type,String Brand) {
        switch (type.toLowerCase()) {
            case "bike":
                return new Bike(Brand);
            case "car":
                return new Car(Brand);
            case "bus":
                return new Bus(Brand);
            case "truck":
                return new Truck(Brand);
            default:
                throw new IllegalArgumentException("Unknown Vehicle Category: " + type);
        }
    }
}
