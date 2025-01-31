package cars;

public class Car implements Movable, Refuelable {
    double odometer = 0;
    double tank = 0;
    public void move(double distance) {
        odometer += distance;
        System.out.println(String.format("The odometer is at %d kilometers", (int)odometer));
    }
    public void refuel(double liters) {
        tank += liters;
        System.out.println(String.format("The tank is at %d liters", (int)tank));
    }
}
