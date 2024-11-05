package SOLID_Design_Principle.main;
// Here we can observe that method is dependent on the interface i.e abstraction not the concrete classes
// Dependency Inversion Principle is followed here
public class LateFeeCalculator {
    // Method Takes Interface not the concrete Class
    public double calculateTotalLateFees(LateFeeCalculate[] items,int days){
        double totalLateFee = 0;
        for(LateFeeCalculate item : items){
            totalLateFee += item.calculateLateFee(days);
        }
        return totalLateFee;
    }
}
