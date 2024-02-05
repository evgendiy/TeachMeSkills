package homework11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DynamicCollection <Integer> col = new DynamicCollection<>();
        col.addElement(null);
        col.addElement(null);
        col.addElement(null);
        System.out.println(col.capacity);
        System.out.println(col.toString());
        System.out.println(col.getSize());
        System.out.println(col.checkElement(1));
//        System.out.println(col.getSize());
//        col.removeElement(2);
//        col.removeElement(2);
        col.removeAllElements();

    }
}
