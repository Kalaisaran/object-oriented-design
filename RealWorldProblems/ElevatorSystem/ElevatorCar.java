package RealWorldProblems.ElevatorSystem;

import java.util.Queue;

public class ElevatorCar {

    private final int id;

    private int currentFloor;
    private ElevatorState state;

    private final Door door = new Door();
    private ElevatorPanel panel;

    private Queue<Integer> requestQue;

    private int load;
    private int overloaded;
    private int maintenance;

    public ElevatorCar(int id) {
        this.id = id;
    }

    public void enterMaintenance() {
    }

    public void exitMaintenance() {
    }

    public void registerRequest(int randomFloor) {
    }

    public int getId() {
        return id;
    }

    public void move() {
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public ElevatorState getState() {
        return state;
    }
}
