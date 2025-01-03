package Mini_Projects.Vehicle_Renting_System_Project.Vehicles;

// ISP and SRP is followed
// This interface is holding responsibility of calculating Rental Price

public interface ChargeRent {
    // Methods of ChargeRent
    double getChargePerKilometers(double kilometers);  // Returns the charge per km for renting the vehicle
    void setChargeAfterDiscount(double discount);
}
