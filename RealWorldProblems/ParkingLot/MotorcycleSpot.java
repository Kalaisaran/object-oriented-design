package RealWorldProblems.ParkingLot;

public class MotorcycleSpot extends ParkingSpot{
    public MotorcycleSpot(int i) {
        super();
    }

    @Override
    public boolean assignVehicle(Vehicle vehicle) {
        return false;
    }
}
