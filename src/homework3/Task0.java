package homework3;

import java.util.Scanner;
/**
 * Создать массив, проверить наличие в нем введенного с консоли числа
 */
public class Task0 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search number");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Number is in this array");
                break;
            }else if (i == array.length - 1) {
                System.out.println("The array doesn't contain this number");
            }
        }
    }
}

