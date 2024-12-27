package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

public interface ChargeRent {
    double getChargePerKilometers(double kilometers);  // Returns the charge per km for renting the vehicle
    void setChargeAfterDiscount(double discount);
}
