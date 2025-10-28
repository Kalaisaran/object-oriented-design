package RealWorldProblems.AmazonLockerService;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private String phone;

    public Customer(String customerId, String name, String email, String phone) { }

    public void placeOrder(Order order) { }

    public void requestReturn(Order order) { }

    public void receiveNotification(Notification notification) { }

    public String getCustomerId() {
        return customerId;
    }
}
