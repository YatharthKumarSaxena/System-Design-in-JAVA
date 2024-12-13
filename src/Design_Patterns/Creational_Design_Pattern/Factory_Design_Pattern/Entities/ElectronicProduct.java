package Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities;

public class ElectronicProduct implements Product{
    @Override
    // Member Function
    public void displayInfo() {
        System.out.println("This is an Electronic Product");
    }
}
