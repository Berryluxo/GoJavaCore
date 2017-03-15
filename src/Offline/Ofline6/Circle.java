package Offline.Ofline6;

/**
 * Created by Lina.Burkalo on 09.03.2017.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}
