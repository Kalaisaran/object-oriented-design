package RealWorldProblems.ElevatorSystem;

import java.util.Random;

public class MainDriver {

    public static void main(String[] args) {
        int numOfFloors = 18;
        int numOfCars = 4;
        int numOfDisplays = 3;

        ElevatorSystem elevatorSystemSystem = ElevatorSystem.getInstance(numOfFloors, numOfCars);
        // SCENARIO 1
        System.out.println("=== Scenario 1: Elevator 3 in maintenance, passenger calls elevator from floor 7 ===\n");
        elevatorSystemSystem.monitoring();
        System.out.println();

        ElevatorCar car3 = elevatorSystemSystem.getCars().get(2);
        car3.enterMaintenance();
        System.out.println();
        elevatorSystemSystem.monitoring();
        System.out.println();

        runCall(elevatorSystemSystem, 7, Direction.UP);

        car3.exitMaintenance();
        System.out.println("\n--- Resetting maintenance for all elevators ---\n");
        elevatorSystemSystem.monitoring();
        System.out.println();



        System.out.println("=== Scenario 2: Random positions, passenger calls elevator from ground (0) to top (12) ===");
        Random rand = new Random();
        for (ElevatorCar car : elevatorSystemSystem.getCars()) {
            int randomFloor = rand.nextInt(numOfFloors);
            System.out.printf("\n== Setting random position for Elevator %d ==", car.getId()+1);
            System.out.printf("\n→ Teleporting Elevator %d to floor %d%n", car.getId()+1, randomFloor);
            car.registerRequest(randomFloor);
            car.move();
        }

        System.out.println("\nElevator positions after random repositioning:");
        for (ElevatorCar car : elevatorSystemSystem.getCars()) {
            System.out.printf("Elevator %d ► Floor: %d | State: %s%n",
                    car.getId()+1, car.getCurrentFloor(), car.getState());
        }
        System.out.println();

        runCall(elevatorSystemSystem, 0, Direction.UP);

    }

    private static void runCall(ElevatorSystem elevatorSystem, int floor, Direction dir) {
        System.out.printf("Passenger calls lift on floor %d (%s)%n", floor, dir);
        ElevatorCar nearest = elevatorSystem.getNearestIdleCar(floor);                     //TODO: This has to implement Strategy Pattern
        if (nearest == null) {
            System.out.println("No idle elevator available right now.");
            return;
        }
        System.out.printf("→ Nearest elevator is %d at floor %d. Lift going %s.%n", nearest.getId()+1, nearest.getCurrentFloor(), dir);
        elevatorSystem.callElevator(floor, dir);
        elevatorSystem.dispatcher();
        System.out.println("\n[Status after dispatch]");
        elevatorSystem.monitoring();
        System.out.println(new String(new char[100]).replace('\0', '-'));
    }
}
