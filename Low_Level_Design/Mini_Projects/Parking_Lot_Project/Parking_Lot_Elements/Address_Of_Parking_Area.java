package Mini_Projects.Parking_Lot_Project.Parking_Lot_Elements;

import java.util.List;

public class Address_Of_Parking_Area implements Address{

    // Data Members
    private String ID;
    private String place;
    private String pinCode;
    private String city;
    private String state;
    private String country;

    // Parameterized Constructors
    public Address_Of_Parking_Area(String ID, String place, String pinCode, String city, String state, String country) {
        this.ID = ID;
        this.place = place;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Member Functions
    @Override
    public String get_ID() {
        return this.ID;
    }

    @Override
    public String get_Place() {
        return this.place;
    }

    @Override
    public String get_pinCode() {
        return this.pinCode;
    }

    @Override
    public String gey_City() {
        return this.city;
    }

    @Override
    public String get_State() {
        return this.state;
    }

    @Override
    public String get_Country() {
        return this.country;
    }
}