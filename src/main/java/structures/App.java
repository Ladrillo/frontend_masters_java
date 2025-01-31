package structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println("Iterating: " + i.next());
        }

        System.out.println(fruits);
        System.out.println(fruits.contains("lemon"));
        System.out.println(fruits.size());

        fruits.remove("lemon");
        System.out.println(fruits.contains("lemon"));
        System.out.println(fruits.size());

        List<String> cars = new ArrayList<String>();
        cars.add("Prius");
        cars.add("Tacoma");
        cars.add("Celica");
        System.out.println(cars);
        System.out.println(cars.get(0));

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("lemon", 45);
        fruitCalories.putIfAbsent("apple", 34);
        fruitCalories.putIfAbsent("orange", 27);
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("lemon"));
        System.out.println(fruitCalories.containsKey("lemon"));

        for (Map.Entry<String, Integer> calInfo : fruitCalories.entrySet()) {
            System.out.println(calInfo.getKey() + " has " + calInfo.getValue() + " calories.");
        }
    }
}
