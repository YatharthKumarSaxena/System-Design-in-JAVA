package Design_Patterns.Creational_Design_Pattern.Builder_Design_Pattern;

import Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities.Product;

import java.util.List;

public class Order {

    // Data Members
    private String OrderId;
    private List<Product> products;

    // Parameterized Constructor
    private Order(OrderBuilder Builder){
        this.OrderId = Builder.OrderId;
        this.products = Builder.products;
    }

    // Nested Class
    public static class OrderBuilder{

        // Data Members
        private final String OrderId;
        private final List<Product> products;

        // Parameterized Constructor
        public OrderBuilder(String OrderId, List<Product> products) {
            this.OrderId = OrderId;
            this.products = products;
        }

        // Member Function
        public Order build(){
            return new Order(this);
        }
    }
}
