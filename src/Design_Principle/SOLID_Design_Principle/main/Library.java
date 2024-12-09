package Design_Principle.SOLID_Design_Principle.main;

import Design_Principle.SOLID_Design_Principle.Library_Items.Library_Item;

// Parent object can be replaced by any of it's child object in calculateTotalValue function
// And there is no risk of error
// Hence Liskov's Substitution Principle is followed here

public class Library {

    // Data Members

    // Private Data Member
    private Library_Item[] items;

    // Public Parameterized Constructor

    public Library(Library_Item[] items) {
        this.items = items;
    }

    // Member Functions

    public double calculateTotalValue(){
        double totalValue = 0;
        for(Library_Item item : items){
            totalValue += item.getValue();
        }
        return totalValue;
    }
    /* Calculate the total value of the library Item */
}
