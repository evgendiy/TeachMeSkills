package homework3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        System.out.println("Array1 " + Arrays.toString(array1));
        System.out.println("Array2 " + Arrays.toString(array2));
        double average1 = (double) sum1 / array1.length;
        double average2 = (double) sum2 / array2.length;
        if (average1 > average2) {
            System.out.println("Среднее значение первого массива больше");
        } else if (average1 < average2) {
            System.out.println("Среднее значение второго массива больше");
        } else {
            System.out.println("Средние значения массивов равны");
        }
    }
}
