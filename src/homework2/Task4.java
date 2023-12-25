package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter temperature");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature <= -20) {
            System.out.println("Холодно");
        } else if (temperature > -20 && temperature <= -5) {
            System.out.println("Нормально");
        } else if (temperature > -5) {
            System.out.println("Тепло");
        }
    }
}
