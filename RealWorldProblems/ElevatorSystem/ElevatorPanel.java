package RealWorldProblems.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;
public class ElevatorPanel {
    private List<ElevatorButton> floorButtons;
    private DoorButton openButton;
    private DoorButton closeButton;
    private EmergencyButton emergencyButton;

    public ElevatorPanel(int numFloors) {

        List<ElevatorButton> floorButtons = new ArrayList<>();
        for(int i=1; i<=numFloors; i++){
            floorButtons.add(new ElevatorButton(i));
        }
    }

    public List<ElevatorButton> getFloorButtons() {
        return floorButtons;
    }

    public void setFloorButtons(List<ElevatorButton> floorButtons) {
        this.floorButtons = floorButtons;
    }

    public DoorButton getOpenButton() {
        return openButton;
    }

    public void setOpenButton(DoorButton openButton) {
        this.openButton = openButton;
    }

    public DoorButton getCloseButton() {
        return closeButton;
    }

    public void setCloseButton(DoorButton closeButton) {
        this.closeButton = closeButton;
    }

    public EmergencyButton exitEmergencyButton() {
        return emergencyButton;
    }

    public void enterEmergencyButton(EmergencyButton emergencyButton) {
        this.emergencyButton = emergencyButton;
    }
}
