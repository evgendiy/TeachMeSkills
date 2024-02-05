package homework12.task1;

import java.util.List;
import java.util.Scanner;

/**
 * Задача 1
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 * На экран вывести четные числа из коллекции.
 */
public class Task1 {


    public static void fillingList(List<Integer> list) {
        System.out.println("Введите число. Для остановки введите \"exit\"");
        String s = "";
        while (true) {
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();
            if (!s.equals("exit")) {
                try {
                    list.add(Integer.valueOf(s));
                } catch (NumberFormatException e) {
                    System.out.println("Неверный ввод");
                }
            } else {
                break;
            }
        }
    }

    public static void showEvenNumbers(List<Integer> list) {
        System.out.println("Четные числа: ");
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
