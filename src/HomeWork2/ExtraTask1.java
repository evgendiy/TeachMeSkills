package HomeWork2;

/**
 * Вывести первые 11 чисел последовательности Фибоначчи
 */
public class ExtraTask1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i < 11; ++i) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}
