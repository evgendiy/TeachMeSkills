package homework12.task2;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть возможно ошибок при получении размера коллекции с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */
public class Task2 {


    public static int sizeCreation() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter positive number");
                int size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    return size;
                } else {
                    System.out.println("wrong number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter positive number.");
            }
        }
    }

    public static void fillingRandomNumbers(List <Integer>list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
    }

    public static double average(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return (double) sum / list.size();
    }

}


