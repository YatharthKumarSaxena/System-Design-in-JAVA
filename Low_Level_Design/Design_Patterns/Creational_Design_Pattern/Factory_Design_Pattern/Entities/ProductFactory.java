package Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities;

import java.util.Locale;

/*
Should have the logic and the control to create Product Objects
 */

public class ProductFactory {

    // Member Function
    public Product createProduct(String category){
        switch(category.toLowerCase()){
            case "electronics" :
                return new ElectronicProduct();
            case "clothing" :
                return new ClothingProduct();
            case "grocery" :
                return new GroceryProduct();
                // In future if needed we can add more products
            default :
                throw new IllegalArgumentException("Invalid category asked : "+ category);
        }
    }
}
