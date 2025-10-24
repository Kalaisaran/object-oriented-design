package RealWorldProblems.ElevatorSystem;

public class ElevatorButton extends Button{

    private final int destinationFloor;
    public ElevatorButton(int floor){
        destinationFloor = floor;
    }

    public int getDestinationFloor(){
        return  destinationFloor;
    }

    public boolean isPressed(){
        return pressed;
    }
}
