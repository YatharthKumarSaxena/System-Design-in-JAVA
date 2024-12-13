package Design_Patterns.Creational_Design_Pattern.Builder_Design_Pattern;

import Design_Patterns.Creational_Design_Pattern.Factory_Design_Pattern.Entities.Product;

import java.util.List;

public class Order {
    private String OrderId;
    private List<Product> products;
    private Order(OrderBuilder Builder){
        this.OrderId = Builder.OrderId;
        this.products = Builder.products;
    }
    public static class OrderBuilder{
        private final String OrderId;
        private final List<Product> products;

        public OrderBuilder(String OrderId, List<Product> products) {
            this.OrderId = OrderId;
            this.products = products;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
