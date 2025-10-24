package RealWorldProblems.ElevatorSystem;

public class HallButton extends Button{
    private final Direction direction;

    public HallButton(Direction dir, Direction direction){
        this.direction = direction;
    }
    public Direction getDirection(){return null;}
    public boolean isPressed(){return pressed;}

}
