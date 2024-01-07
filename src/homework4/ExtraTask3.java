package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Создайте двумерный массив и выведите на консоль сумму всех его элементов
 */
public class ExtraTask3 {
    public static void main(String[] args) throws IOException {
        int[][] array = arrayCreation();
        System.out.println(Arrays.deepToString(array));
        System.out.println("Sum of elements is " + sumOfElements(array));
    }

    static int[][] arrayCreation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows of array ");
        int rows = Integer.parseInt(reader.readLine());
        System.out.println("Enter the number of columns of array ");
        int columns = Integer.parseInt(reader.readLine());
        reader.close();
        int[][] array = new int[rows][columns];
        reader.close();
        fillingArray(array);
        return array;
    }

    public static void fillingArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(11);
            }
        }

    }

    public static int sumOfElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
