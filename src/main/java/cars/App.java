package cars;

public class App {
    public static void main(String[] args) {
        System.out.println("Program running");
        Car prius = new Car();
        prius.refuel(67);
        prius.move(56);
        prius.move(24);
        prius.move(11);
    }
}
