package homework2;

import java.util.Scanner;


public class ExtraTask2 {
    public static void main(String[] args) {
        System.out.println("Enter deposit amount");
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        System.out.println("Enter number of month");
        int numberOfMonth = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numberOfMonth; i++) {
            sum += sum * 0.07;
        }
        System.out.println("The final deposit amount = " + sum);
    }
}
