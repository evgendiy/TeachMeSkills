package HomeWork2;

/**
 * Вывод нечетных от 1 до 99
 */
public class Loops1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
