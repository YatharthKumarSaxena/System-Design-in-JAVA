package Mini_Projects.Vehicle_Renting_System_Project.User_Database;

// DRY Principle is followed to minimize code redundancy
/* SRP is followed */

public interface Employee_Interface extends User{
    // Methods of Employee
    double get_Discount_On_Rent();     // Working Employees are given Discount on rent Vehicle
}
