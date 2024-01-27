package homework7.task1;

public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double perimeter() {
        return side * 4;
    }

    @Override
    double area() {
        return Math.pow(side, 2);
    }

}
