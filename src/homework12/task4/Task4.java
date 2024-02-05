package homework12.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Задача 4
 * Создать класс для описания клиента.
 * Поместить в класс поля для описания клиента (дата регистрации(LocalDate), имя, возраст и другие поля по усмотрению).
 * Класс клиента должен содержать поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
 * Класс заказа должен содержать поля для описания заказа (цена, описание и возможны другие поля).
 * Создать нескольких клиентов.
 * Для каждого клиента создать несколько заказов и поместить их в поле-коллекцию для заказов.
 * Создать коллекцию типа Мар и заполнить ее парами "номер паспорта клиента" -> "объект класса клиент".
 * Номера паспортов можно хранить как константы в созданном для этого интерфейсе.
 * Пройти циклом по коллекции и вывести на экран:
 * - все пары ключ-значение, использую Map.Entry<K, V> entry : map.entrySet()
 * - все пары ключ-значение, использую итератор
 * - все ключи, используя map.keySet()
 * - все значения, используя map.values()
 */
public class Task4 implements Passports {
    public static void main(String[] args) {
        Client client1 = new Client(LocalDate.of(2023, 12, 23), "Denis", 23, new ArrayList<>());
        Client client2 = new Client(LocalDate.of(2024, 1, 15), "Marina", 35, new ArrayList<>());
        Client client3 = new Client(LocalDate.of(2023, 10, 2), "Lesya", 18, new ArrayList<>());

        client1.addOrder(new Order(222.22, "product 1"));
        client1.addOrder(new Order(4.32, "product 2"));
        client2.addOrder(new Order(1, "product 1"));
        client2.addOrder(new Order(33, "product 2"));
        client3.addOrder(new Order(23.23, "product 1"));
        client3.addOrder(new Order(44.55, "product 2"));

        Map<String, Client> clientData = new HashMap<>();
        clientData.put(PASSPORT1, client1);
        clientData.put(PASSPORT2, client2);
        clientData.put(PASSPORT3, client3);

        for (Map.Entry<String, Client> pair : clientData.entrySet()) {
            System.out.println(pair);
        }

        Iterator<Map.Entry<String, Client>> iterator = clientData.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> iter = iterator.next();
            System.out.println("Key: " + iter.getKey() + ", Value: " + iter.getValue());
        }

        System.out.println(clientData.keySet());
        System.out.println(clientData.values());


    }
}
