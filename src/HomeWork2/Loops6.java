package HomeWork2;

/**
 * Вывести квадраты чисел от 10 до 20 включительно
 */
public class Loops6 {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
        //v2
        System.out.println();
        for (int i = 10; i <= 20; i++) {
            System.out.print(Math.pow(i, 2) + " ");
        }
    }
}
