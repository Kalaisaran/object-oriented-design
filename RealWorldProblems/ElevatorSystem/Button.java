package RealWorldProblems.ElevatorSystem;

public abstract class Button {
    protected boolean pressed;
    public void pressDown(){}
    public void reset(){} //pressUp or release
    public abstract boolean isPressed();
}
