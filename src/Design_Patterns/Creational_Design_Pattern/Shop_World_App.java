package Design_Patterns.Creational_Design_Pattern;

import Design_Patterns.Creational_Design_Pattern.Builder_Design_Pattern.Order;
import Design_Patterns.Creational_Design_Pattern.Builder_Design_Pattern.UserAccount;
import Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities.Product;
import Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities.ProductFactory;
import Design_Patterns.Creational_Design_Pattern.Singleton_Design_Pattern.DataAccessLayer.UserDatabase;

import java.util.ArrayList;
import java.util.List;

public class Shop_World_App {
    public static void main(String[] args) {

        // Create the user database - Singleton
        UserDatabase userDatabase1 = UserDatabase.getInstance();
        UserDatabase userDatabase2 = UserDatabase.getInstance();

        // Getting the same instance on calling userDatabase multiple times
        // Hence No chance of inconsistency
        System.out.println(userDatabase1);
        System.out.println(userDatabase2);

        // Factory Design Pattern
        ProductFactory productFactory = new ProductFactory();
        Product electronicProduct = productFactory.createProduct("Electronics");
        Product clothingProduct = productFactory.createProduct("CLOTHING");
        Product groceryProduct = productFactory.createProduct("grocery");
        // Product invalidProduct = productFactory.createProduct("stationary");
        clothingProduct.displayInfo();
        List<Product> products = new ArrayList<>();
        products.add(electronicProduct);
        products.add(groceryProduct);
        products.add(clothingProduct);


        // Builder Design Pattern


        // Build the user account

        UserAccount.UserAccountBuilder userBuilder = new UserAccount.UserAccountBuilder("Yatharth Kumar Saxena","1234");
        UserAccount userAccount = userBuilder.build();
        System.out.println(userAccount);

        // Build the Order

        Order.OrderBuilder orderBuilder = new Order.OrderBuilder("Order1",products);
        Order order = orderBuilder.build();
    }


}
