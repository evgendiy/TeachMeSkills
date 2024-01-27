package homework7.task1;

import homework7.task1.Figure;

public class Circle extends Figure {
    double radius = 10;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
