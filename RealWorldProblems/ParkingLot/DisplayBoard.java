package RealWorldProblems.ParkingLot;

import java.util.List;
import java.util.Map;

class DisplayBoard {
    private int id;
    private Map<Integer, List<ParkingSpot>> parkingSpots;

    public DisplayBoard(int id) { /* ... */ }
    public void addParkingSpot(String spotType, List<ParkingSpot> spots) { /* ... */ }
    public void showFreeSlot() { /* ... */ }

    public void update(ParkingSpot parkingSpot){

        List<ParkingSpot> spots = parkingSpots.get(parkingSpot.getId());
        spots.add(parkingSpot);
        parkingSpots.put(parkingSpot.getId(), spots);


    }
}
