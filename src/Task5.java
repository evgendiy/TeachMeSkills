import java.util.Scanner;

/**
 * По номеру цвета вывести цвета радуги
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter numebr");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case (1):
                System.out.println("Красный");
                break;
            case (2):
                System.out.println("Оранжевый");
                break;
            case (3):
                System.out.println("Желтый");
                break;
            case (4):
                System.out.println("Зеленый");
                break;
            case (5):
                System.out.println("Голубой");
                break;
            case (6):
                System.out.println("Синий");
                break;
            case (7):
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("В радуге 7 цветов");
        }
    }
}
