package RealWorldProblems.AmazonLockerService;

import java.util.Date;
import java.util.List;

public class LockerLocation {
    private String name;
    private List<Locker> lockers;
    private double longitude;
    private double latitude;
    private Date openTime;
    private Date closeTime;

    public LockerLocation(String downtown, double v, double v1, Date date, Date date1) {
    }

    public void addLocker(Locker locker) {
        // Implement your logic here
    }

    public String getName() {
        return name;
    }
}
