package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = 1000;
        double bonus = 200;
        int quota = 10;
        System.out.println("How many sales did you do?");
        int sales = scanner.nextInt();
        if (sales > quota) {
            System.out.println("Congratz! You're a machine...");
            salary += bonus;
        } else {
            System.out.println("You came short by " + (quota - sales) + " sale(s).");
        }
        System.out.println("You earned: $" + salary);
        scanner.close();
    }
}
