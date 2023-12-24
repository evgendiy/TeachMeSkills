package HomeWork2;

import java.util.Scanner;

/**
 * Написать программу для вывода поры года по номеру месяца(if else)
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong number");
        }
    }
}
