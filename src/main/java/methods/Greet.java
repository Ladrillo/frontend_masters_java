package methods;

import java.util.Scanner;

public class Greet {
  public static int gaga = 7;
  public static void main(String[] args) {
    String theName = doGreet();
    System.out.println(theName);
  }

  public static String doGreet() {
    System.out.println("Was yer name, bud?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("So your name is " + name + "?");
    scanner.close();
    return name;
  }
}
