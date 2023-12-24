package HomeWork2;

/**
 * Вывести на экран последовательность 7 14 21 28 35 42 49 56 63 70 77 84 91 98 (используя while)
 */
public class Loops4 {
    public static void main(String[] args) {
        int i = 7;
        while (i < 99) {
            System.out.print(i + " ");
            i += 7;
        }
    }
}
