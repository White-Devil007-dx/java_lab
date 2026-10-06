import java.util.*;

// Abstract parent class
abstract class Order {
    private String orderId;
    private String productName;

    public Order(String orderId, String productName) {
        this.orderId = orderId;
        this.productName = productName;
    }

    public String getOrderId() { return orderId; }
    public String getProductName() { return productName; }

    // Abstract methods
    public abstract void estimateDelivery();
    public abstract void trackShipment();
}

// Subclass: ExpressOrder
class ExpressOrder extends Order {
    public ExpressOrder(String orderId, String productName) {
        super(orderId, productName);
    }

    @Override
    public void estimateDelivery() {
        System.out.println("Express delivery for Order " + getOrderId() + " (" + getProductName() + ") will arrive in 1–2 days.");
    }

    @Override
    public void trackShipment() {
        System.out.println("Tracking Express Order " + getOrderId() + ": Shipment is in fast transit.");
    }
}

// Subclass: StandardOrder
class StandardOrder extends Order {
    public StandardOrder(String orderId, String productName) {
        super(orderId, productName);
    }

    @Override
    public void estimateDelivery() {
        System.out.println("Standard delivery for Order " + getOrderId() + " (" + getProductName() + ") will arrive in 5–7 days.");
    }

    @Override
    public void trackShipment() {
        System.out.println("Tracking Standard Order " + getOrderId() + ": Shipment is moving through regular logistics.");
    }
}

// Customer class with 1-to-many association
class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void showOrders() {
        System.out.println("\nOrders for customer: " + name);
        for (Order o : orders) {
            o.estimateDelivery();   // Polymorphic call
            o.trackShipment();      // Class-specific behavior
        }
    }
}

// Main class
public class ShoppingCart12 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Chakri");

        // Add different types of orders
        c1.addOrder(new ExpressOrder("ORD101", "Laptop"));
        c1.addOrder(new StandardOrder("ORD102", "Books"));
        c1.addOrder(new ExpressOrder("ORD103", "Smartphone"));

        // Display orders
        c1.showOrders();
    }
}
