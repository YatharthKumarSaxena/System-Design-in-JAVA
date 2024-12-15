package Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities;

public class GroceryProduct implements Product{
    @Override
    // Member Function
    public void displayInfo() {
        System.out.println("This is a Grocery Product");
    }
}
