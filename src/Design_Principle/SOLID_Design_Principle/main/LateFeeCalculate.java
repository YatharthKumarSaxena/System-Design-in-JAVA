package Design_Principle.SOLID_Design_Principle.main;
// Here We can observe that our interface is not fat as well as it handle single responsibility of calculating the fees
// Single Responsibility Principle is followed here
// Interface Segregation Principle is followed here
public interface LateFeeCalculate {
    // Methods of LateFeeCalculate
    double calculateLateFee(int days);
}
