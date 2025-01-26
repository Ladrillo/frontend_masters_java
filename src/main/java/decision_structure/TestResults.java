package decision_structure;

import java.util.Scanner;

public class TestResults {
  public static void main(String[] args) {
    System.out.println("Enter your score: ");
    Scanner scanner = new Scanner(System.in);
    double score = scanner.nextDouble();
    scanner.close();
    char grade;
    if (score < 60) {
      grade = 'F';
    } else if (score < 70) {
      grade = 'D';
    } else if (score < 80) {
      grade = 'C';
    } else if (score < 90) {
      grade = 'B';
    } else {
      grade = 'A';
    }
    System.out.println("Your grade is: " + grade);
    String message;
    switch (grade) {
      case 'A':
        message = "Excellent job!";
        break;
      case 'B':
        message = "Good job!";
        break;
      case 'C':
        message = "You can do better!";
        break;
      case 'D':
        message = "You need to study more!";
        break;
      default:
        message = "You failed!";
    }
    System.out.println(message);
  }
}
