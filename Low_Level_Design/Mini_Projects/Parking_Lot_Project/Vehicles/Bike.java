package Mini_Projects.Parking_Lot_Project.Vehicles;

// SRP is followed
// Open Closed Principle is followed here
// As we can create other classes like truck , bus etc. without modifying the code

public class Bike implements Vehicle{

    // Data Members
    private String registrationNumber;
    private String state;
    private String country;

    // Parameterized Constructor
    public Bike(String registrationNumber, String state, String country) {
        this.registrationNumber = registrationNumber;
        this.state = state;
        this.country = country;
    }

    // Member Functions
    @Override
    public String get_Registration_Number() {
        return this.registrationNumber;
    }

    @Override
    public String get_State() {
        return this.state;
    }

    @Override
    public String get_Country() {
        return this.country;
    }

    @Override
    public String get_Type() {
        return "Two-Wheeler";
    }

    @Override
    public double calculateRentalPrice(double hour) {
        return hour*5;
    }
}
