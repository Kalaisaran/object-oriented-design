package RealWorldProblems.ElevatorSystem;

import java.util.List;

public class ElevatorSystem {

    private static ElevatorSystem elevatorSystem;
    private final Building building;

    private ElevatorSystem(int floors, int cars, Building building){
        this.building = building;
    }
    public static ElevatorSystem getInstance(int floors, int cars){return null;}
    public List<ElevatorCar> getCars(){return null;}
    public Building getBuilding() { return null; }

    public ElevatorCar getNearestIdleCar(int floor) { return null; }
    public void dispatcher() { }
    public void monitoring() { }

    public void callElevator(int floor, Direction dir) {
    }
}
