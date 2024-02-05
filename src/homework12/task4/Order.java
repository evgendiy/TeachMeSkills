package homework12.task4;

/**
 * Задача 4
 * Класс заказа должен содержать поля для описания заказа (цена, описание и возможны другие поля).
 */
public class Order {
    private double price;
    private String description;

    public Order(double price, String description) {
        setPrice(price);
        setDescription(description);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.isEmpty()) {
            this.description = description;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
