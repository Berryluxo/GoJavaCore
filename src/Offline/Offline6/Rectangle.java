package Offline.Offline6;

/**
 * Created by Lina.Burkalo on 09.03.2017.
 */
public class Rectangle extends Shape {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }
}
