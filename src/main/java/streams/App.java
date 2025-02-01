package streams;

import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        HashMap<Integer, Integer> hash = new HashMap<>();
        Arrays.stream(arr).parallel().forEach(n -> {
            System.out.println("--> " + n);
            hash.put(n - 1, n * 10);
        });

        System.out.println(hash);
    }
}
