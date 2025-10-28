package RealWorldProblems.AmazonLockerService;

import java.util.Date;

public class LockerPackage extends Package {

    private String lockerId;
    private String code;
    private int codeValidDays;
    private Date packageDeliveryTime;
    private String deliveryPersonId;

    public LockerPackage(String packageId, double packageSize, Order order,
                         int codeValidDays, String lockerId, String code,
                         Date packageDeliveryTime, String deliveryPersonId) {
        super();
    }

    public int getCodeValidDays() {
        return codeValidDays;
    }
    public String getLockerId() {
        return lockerId;
    }
    public String getCode() {
        return code;
    }
    public Date getPackageDeliveryTime() {
        return packageDeliveryTime;
    }
    public String getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public boolean isValidCode() {
        return true;
    }
    public boolean verifyCode(String code) {
        return false;
    }
}
