package homework2;

import java.util.Scanner;

/**
 * Написать программу, которая будет принимать на вход число и на выход будет выводить сообщение четное оно или нет
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        String answer = number % 2 == 0 ? "Число четное." : "Число нечетное.";
        System.out.println(answer);
    }
}
