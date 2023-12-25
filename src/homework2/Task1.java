package homework2;

import java.util.Scanner;

/**
 * Написать программу для вывода поры года по номеру месяца(switch-case)
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
