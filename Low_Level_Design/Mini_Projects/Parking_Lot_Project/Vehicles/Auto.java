package Mini_Projects.Parking_Lot_Project.Vehicles;

public class Auto implements Vehicle{

    // Data Members
    private String registrationNumber;
    private String state;
    private String country;

    // Parameterized Constructor
    public Auto(String registrationNumber, String state, String country, int ticketID) {
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
        return "Three-Wheeler";
    }

    @Override
    public double calculateRentalPrice(double hour) {
        return hour*8;
    }
}
