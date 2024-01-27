package homework7.task1;

public class Main {
    public static void main(String[] args) {
        Figure[] array = {new Circle(2.5), new Rectangle(2, 4), new Triangle(3, 4, 5), new Square(3.3), new Square(2)};
        double sumOfPerimeters = 0;
        for (Figure figure : array) {
            sumOfPerimeters += figure.perimeter();
        }
        System.out.println("Сумма периметров фигур: " + sumOfPerimeters);
    }
}
