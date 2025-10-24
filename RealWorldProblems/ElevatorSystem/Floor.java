package RealWorldProblems.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private final int floorNumber;
    private final List<HallPanel> panels;
    private final Display display;

    public Floor(int floorNumber, int numPanels) {
        this.floorNumber =floorNumber;
        this.panels =new ArrayList<>();
        for(int i = 1; i<=numPanels;i++) {
            panels.add(new HallPanel(i , numPanels));
        }
        this.display = new Display();
    }

    public int getFloorNumber() { return 0; }
    public List<HallPanel> getPanels() { return null; }
    public HallPanel getPanel(int index) { return null; }
    public Display getDisplay() { return null; }
}
