package homework3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать массив, заменить все вхождения числа на -1, если его нет, то вывести сообщение
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 3, 6, 7, 3, 8, 9, 3, 10};
        boolean checkNumber = false; //переменная для проверки наличия числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search number");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print("Source array: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                checkNumber = true;
                array[i] = -1;
            }
        }
        if (checkNumber) {
            System.out.print("Result array: ");
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("The array doesn't contain this number");
        }

    }
}
