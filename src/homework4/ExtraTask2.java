package homework4;

import java.util.Random;
import java.util.Scanner;

/**
 * Создайте программу для умножения двух матриц
 */
public class ExtraTask2 {
    public static void main(String[] args) {
        int[][] array1 = arrayCreation();
        int[][] array2 = arrayCreation();
        showArray(array1);
        showArray(array2);

        if (array1[0].length != array2.length) {
            System.out.println("Количество столбцов первого массива и количество строк второго массива не совпадает");
        } else {
            System.out.println("Result array: ");
            showArray(multiplex(array1, array2));
        }


    }

    static int[][] arrayCreation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows of array ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns of array ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        fillingArray(array);
        return array;
    }

    public static void fillingArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

    }

    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("");//чтобы разделить два массива между собой
    }

    public static int[][] multiplex(int[][] array1, int[][] array2) {
        int[][] resultArray = new int[array1.length][array2[0].length];
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                for (int k = 0; k < array1[i].length; k++) {
                    resultArray[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return resultArray;
    }
}
