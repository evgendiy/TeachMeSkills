package homework7.task1;

public class Rectangle extends Figure {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double perimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    double area() {
        return side1 * side2;
    }
}
