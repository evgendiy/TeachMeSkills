package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtraTask4 {
    public static void main(String[] args) {
        System.out.println("Enter number from 6 to 10");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int length;
        do {
            length = scanner.nextInt();
            if (!(length > 5 && length <= 10)) {
                System.out.println("Wrong number");
                System.out.println("Enter the number again");
            }
        } while (!(length > 5 && length <= 10));
        scanner.close();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int count = 0; //для проверки наличия и количества четных чисел
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];

        if (count != 0) {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    resultArray[j] = array[i];
                    j++;
                }
            }
            System.out.println("Array        " + Arrays.toString(array));
            System.out.println("Result array " + Arrays.toString(resultArray));
        } else {
            System.out.println("Array" + Arrays.toString(array));
            System.out.println("There aren't even numbers");
        }


    }
}

