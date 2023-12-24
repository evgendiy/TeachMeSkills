package HomeWork2;

import java.util.Scanner;

/**
 * Вывести на экран сумму от 1 до введенного числа(делаю введенное число включительно)
 */
public class Loops3 {
    public static void main(String[] args) {
        System.out.println("Enter positive integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;
        if (number > 0) {
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Wrong number");
        }
    }
}
