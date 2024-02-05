package homework12.task1;

import java.util.ArrayList;
import java.util.List;

import static homework12.task1.Task1.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        fillingList(mylist);
        for (Integer i : mylist) {
            System.out.print(i+" ");
        }
        showEvenNumbers(mylist);
    }
}
