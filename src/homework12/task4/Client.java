package homework12.task4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Задача 4
 * Создать класс для описания клиента.
 * Поместить в класс поля для описания клиента (дата регистрации(LocalDate), имя, возраст и другие поля по усмотрению).
 * Класс клиента должен содержать поле-коллекцию с заказами этого клиента - это, своего рода, корзина заказов клиента.
 */
public class Client {
    private LocalDate registrationDate;
    private String name;
    private int age;
    private List<Order> orders;

    public Client(LocalDate registrationDate, String name, int age, List<Order> orders) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>(orders);
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        if (registrationDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("The date of registration is wrong");
        }
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name == null) && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16 && age < 200) {  //с перспективой на будущее
            this.age = age;
        }
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }


    @Override
    public String toString() {
        return "Client{" +
                "registrationDate=" + registrationDate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                '}';
    }
}
