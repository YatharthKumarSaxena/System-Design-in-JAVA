package Mini_Projects.Parking_Lot_Project.Vehicles;

// SRP is followed

/* Use of Factory Design Pattern */

public class VehicleFactory {
    public static Vehicle createVehicle(String type, String registrationNumber, String region, String country) {
        switch (type.toLowerCase()) {
            case "bike":
                return new Bike(registrationNumber, region, country);
            case "car":
                return new Car(registrationNumber, region, country);
            case "auto":
                return new Auto(registrationNumber, region, country);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
