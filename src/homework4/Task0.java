package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать трехмерный массив, увеличить каждый его элемент, на заданное из консоли число
 */
public class Task0 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(100);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));


    }
}
