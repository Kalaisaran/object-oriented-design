package RealWorldProblems.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private final List<Floor> floors;

    private final List<ElevatorCar> cars;

    public Building(int numOfFloors, int numCars, int numOfDisplaysPerFloor){
        List<Floor> floors = new ArrayList<>();
        for(int i=1; i<=numOfFloors; i++){
            floors.add(new Floor(i, 2));
        }

        this.floors = floors;

        List<ElevatorCar> cars = new ArrayList<>();
        for(int i=1; i<=numCars; i++){
            cars.add(new ElevatorCar(i));
        }

        this.cars = cars;

    }

    public List<Floor> getFloors() {
        return floors;
    }

    public List<ElevatorCar> getCars() {
        return cars;
    }

}
