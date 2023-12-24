package HomeWork2;

/**
 * Написать программу, которая выводит таблицу умножения
 */
public class ExtraTask3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t" + j * i);
            }
            System.out.println();
        }
    }
}
