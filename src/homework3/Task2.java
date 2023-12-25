package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter array size");
        int size = scanner.nextInt();
        scanner.close();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int min = array[0];
        int max = array[0];
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
                continue;
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Average " + (double) sum / array.length);
    }
}

