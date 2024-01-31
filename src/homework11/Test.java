package homework11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DynamicCollection <Integer> col = new DynamicCollection<>();
        col.addElement(1);
        col.addElement(1);
        col.addElement(2);
        col.addElement(3);
        col.addElement(4);
        col.addElement(5);
        col.addElement(6);
        col.addElement(7);
        col.addElement(8);
        col.addElement(9);
        col.addElement(10);
        col.addElement(10);
        System.out.println(col.capacity);
        System.out.println(col.checkElement(1));
        System.out.println(col.getSize());
        col.removeElement(2);
        System.out.println(col.toString());
        col.removeAllElements();
        System.out.println(col.toString());
    }
}
