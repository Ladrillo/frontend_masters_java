package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("Cuántas horas has trabajado esta semana?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        scanner.close();

        System.out.println("What is hour hourly pay rate?");
        double rate = scanner.nextDouble();

        double payRate = hours * rate;
        System.out.println("Your gross pay is: $" + payRate);
    }
}
