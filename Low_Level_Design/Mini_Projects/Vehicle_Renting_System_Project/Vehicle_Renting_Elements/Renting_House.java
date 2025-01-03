package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

import Mini_Projects.Vehicle_Renting_System_Project.Vehicles.Vehicle;

import java.util.List;

/* Use of Composite Design Pattern as Renting_House consist of collection of Vehicles
 * This treats the collection of vehicles as Single Entity
 * If we have different type of Vehicles then they are treated as Single Entity */

public class Renting_House implements Renting_House_Interface{

    // Data Members
    private static int Area_ID;
    private int ID;
    private List<Vehicle> vehicles;
    private Address address;

    // Parameterized Constructor
    public Renting_House(List<Vehicle> vehicles, Address address) {
        Area_ID++;
        this.ID = Area_ID;
        this.vehicles = vehicles;
        this.address = address;
    }

    // Static Member Initialization
    static {
        Area_ID = 0;
    }

    // Member Functions
    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public int getNumberOfEmptySlots() {
        int emptySlots = 0;
        for(Vehicle vehicle: vehicles){
            if(vehicle.get_Slot().get_Status())emptySlots++;
        }
        return emptySlots;
    }

    @Override
    public int getNumberOfFilledSlots() {
        int filledSlots = 0;
        for(Vehicle vehicle: vehicles){
            if(!vehicle.get_Slot().get_Status())filledSlots++;
        }
        return filledSlots;
    }

    @Override
    public Address get_Address() {
        return this.address;
    }

    @Override
    public int getValue() {
        int totalValue = 0;
        for(Vehicle vehicle:vehicles){
            totalValue += vehicle.getValue();
        }
        return totalValue;
    }

    @Override
    public List<Vehicle> getVehicles() {
        return this.vehicles;
    }


}
