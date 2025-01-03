package Mini_Projects.Vehicle_Renting_System_Project.User_Database;

/* SRP is followed */
// DRY principle is followed

public class Employee implements Employee_Interface{

    // Data Members
    private static int User_ID;
    private String name;
    private int ID;
    private String phoneNumber;

    // Private Parametrized Constructor
    public Employee(String name, String phoneNumber) {
        this.name = name;
        User_ID++;
        this.ID = User_ID;
        this.phoneNumber = phoneNumber;
    }

    // Static Member Initialization
    static {
        User_ID = 0;
    }

    // Member Functions

    @Override
    public void display_Category() {
        System.out.println("Given User is an Employee");
    }

    @Override
    public String get_Name() {
        return this.name;
    }

    @Override
    public int get_ID() {
        return this.ID;
    }

    @Override
    public String get_phoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double get_Discount_On_Rent() {      // 25% Discount
        return 0.75;
    }
}
