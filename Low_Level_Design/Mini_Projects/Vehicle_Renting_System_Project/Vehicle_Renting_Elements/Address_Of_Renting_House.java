package Mini_Projects.Vehicle_Renting_System_Project.Vehicle_Renting_Elements;

public class Address_Of_Renting_House implements Address{

    // Data Members
    private static int Address_ID;
    private int ID;
    private String place;
    private String pinCode;
    private String city;
    private String state;
    private String country;

    // Parameterized Constructors
    public Address_Of_Renting_House(String place, String pinCode, String city, String state, String country) {
        Address_ID++;
        this.ID = Address_ID;
        this.place = place;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }


    // Static Member Initialization
    static {
        Address_ID = 0;
    }

    // Member Functions
    @Override
    public int get_ID() {
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
