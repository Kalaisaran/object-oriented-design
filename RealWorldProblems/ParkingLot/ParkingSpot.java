package RealWorldProblems.ParkingLot;

public abstract class ParkingSpot {

    private int id;
    private boolean isFree;
    private Vehicle Vehicle;

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle(){
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public RealWorldProblems.ParkingLot.Vehicle getVehicle() {
        return Vehicle;
    }

    public void setVehicle(RealWorldProblems.ParkingLot.Vehicle vehicle) {
        Vehicle = vehicle;
    }
}
