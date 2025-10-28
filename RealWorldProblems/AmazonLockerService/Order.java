package RealWorldProblems.AmazonLockerService;

import java.util.List;

public class Order {
    private String orderId;
    private List<Item> items;
    private String deliveryLocation;
    private String customerId;

    public Order(String orderId, String deliveryLocation, String customerId) { }

    public String getOrderId() {
        return orderId;
    }
    public String getDeliveryLocation() {
        return deliveryLocation;
    }
    public String getCustomerId() {
        return customerId;
    }
    public List<Item> getItems() {
        return items;
    }
    public void addItem(Item item) { }
}
