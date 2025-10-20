package RealWorldProblems.ParkingLot;

public class Handicapped extends ParkingSpot{

    public Handicapped(int i) {
        super();
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
