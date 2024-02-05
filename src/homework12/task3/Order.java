package homework12.task3;


import java.util.Comparator;

public class Order {
    private int id;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public Order(int id, double price) {
        setId(id);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id= " + id +
                ", price= " + price +
                '}';
    }

}
