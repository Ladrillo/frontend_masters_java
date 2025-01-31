package structures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class App {
    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        System.out.println(fruits);
        System.out.println(fruits.contains("lemon"));
        System.out.println(fruits.size());
        fruits.remove("lemon");
        System.out.println(fruits.contains("lemon"));
        System.out.println(fruits.size());

        List cars = new ArrayList();
        cars.add("Prius");
        cars.add("Tacoma");
        cars.add("Celica");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }
}
