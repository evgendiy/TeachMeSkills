package homework12.task5;

import java.util.*;

/**
 * Задача 5
 * Создать коллекцию уникальных имен всех студентов нашей группы + преподаватель.
 * Вывести коллекцию на экран.
 */
public class Task5 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        //список группы содержит дубликаты имен
        nameList.addAll(Arrays.asList("Станислав", "Ирина", "Артем", "Ольга", "Артем", "Алеся",
                "Евгений", "Илья", "Святослав", "Павел", "Рональд", "Ольга"));
        //убираю дубликаты
        Set<String> set = new LinkedHashSet<>(nameList);
        System.out.println("Список без дубликатов");
        for (String string : set) {
            System.out.print(string + " ");
        }
    }
}
