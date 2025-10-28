package RealWorldProblems.AmazonLockerService;

public class Package {
    private String packageId;
    private double packageSize;
    private Order order;

    public Package() { }

    public Package(String pkg1, double v, Order order) {
    }

    public String getPackageId() {
        return packageId;
    }
    public double getPackageSize() {
        return packageSize;
    }
    public Order getOrder() {
        return order;
    }
    public void pack() { }
}
