package homework12.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**Создать свой класс для описания заказа.
 Класс должен содержать поля id заказа и стоимость заказа - обязательные поля.
 Создать несколько заказов и поместить их в коллекцию.
 Вывести коллекцию на экран.
 Отсортировать заказы и вывести отсортированную коллекцию на экран.
 Заказы сортируются по цене по возрастанию.
 Для сортировки заказов следует создать свой компаратор (смотрите пример с занятия).*/
public class Test {
    public static void main(String[] args) {
        List<Order>orders = new ArrayList<>();
        orders.add(new Order(1,2.50));
        orders.add(new Order(2,4.33));
        orders.add(new Order(3,1.76));
        orders.add(new Order(4,22.10));
        orders.add(new Order(5,14.50));
        for (Order order : orders) {
            System.out.println(order.toString());
        }
        //orders.sort((order1, order2) -> Double.compare(order1.getPrice(), order2.getPrice())); почему idea делает это
        // выражение не активным и предлагает заменить на вариант ниже
        orders.sort(Comparator.comparingDouble(Order::getPrice));
        System.out.println("После сортировки");
        for (Order order : orders) {
            System.out.println(order.toString());
        }

    }
}
