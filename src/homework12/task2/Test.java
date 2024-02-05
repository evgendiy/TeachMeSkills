package homework12.task2;

import java.util.ArrayList;
import java.util.List;

import static homework12.task2.Task2.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Task2");
        int size = sizeCreation();
        List<Integer> list = new ArrayList<>(size);
        fillingRandomNumbers(list, size);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(average(list));

    }
}
