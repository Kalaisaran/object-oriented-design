package RealWorldProblems.AmazonLockerService;

import java.util.List;

public class LockerService {
    private List<LockerLocation> locations;

    // The LockerService is a Singleton class that ensures it will have only one active instance at a time
    private static LockerService lockerService = null;

    // Created a static method to access the Singleton instance of LockerService class
    public static LockerService getInstance() {
        if (lockerService == null) {
            lockerService = new LockerService();
        }
        return lockerService;
    }

    public void addLocation(LockerLocation loc) {
        // Implement your logic here
    }

    public Locker findLockerById(String lockerId) {
        // Implement your logic here
        return new Locker();
    }

    // Returns true if the “return” is approved, false otherwise.
    public boolean requestReturn(Order order) {
        // Implement your logic here
        return false;
    }

    // Finds (and returns) the first available Locker across all locations.
    public Locker requestLocker(LockerSize medium) {
        // Implement your logic here
        return null;
    }

    // Delegates to a specific LockerPackage's verifyCode(...) under the hood.
    public boolean verifyOTP(LockerPackage lpkg, String code) {
        // Implement your logic here
        return false;
    }
}
