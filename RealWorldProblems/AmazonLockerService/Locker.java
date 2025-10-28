package RealWorldProblems.AmazonLockerService;

public class Locker {
    private String lockerId;
    private LockerSize lockerSize;
    private String locationId;
    private LockerState lockerState;
    private LockerPackage currentPackage;

    public Locker(String l1, LockerSize lockerSize, String name) {
    }

    public Locker() {

    }

    public boolean addPackage(LockerPackage returnPkg) {
        return false;
    }

    public boolean removePackage(String otp) {
        return false;
    }

    public String getLockerId() {
        return lockerId;
    }
}
