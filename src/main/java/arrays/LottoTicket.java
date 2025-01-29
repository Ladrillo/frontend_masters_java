package arrays;

import java.util.Random;
import java.util.Arrays;

public class LottoTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 99;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        for (int num : ticket) {
            System.out.print(num + " | ");
        }
        System.out.print("\n");
    }

    public static boolean exists(int[] arr, int num) {
        return Arrays.stream(arr).anyMatch(n -> n == num);
    }

    public static int[] generateNumbers() {
        var ticket = new int[LENGTH];
        Random random = new Random();
        int randomNum;
        for (int i = 0; i < LENGTH; i++) {
            do {
                randomNum = random.nextInt(1, MAX_TICKET_NUMBER);
            } while (exists(ticket, randomNum));
            ticket[i] = randomNum;
        }
        Arrays.sort(ticket);
        return ticket;
    }
}
