package Offline.Ofline6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lina.Burkalo on 09.03.2017.
 */
public class UseShapes {
    public static void main(String[] args) {

        List<Shape> listShape = new ArrayList<>();

        listShape.add(new Rectangle(6, 4));
        listShape.add(new Square(7, 4));
        listShape.add(new Circle(8));
        listShape.add(new Rectangle(5, 4));
        
        areaOutput(listShape);
    }

    private static void areaOutput(List<Shape> listShape) {
        for (Shape shape : listShape) {
            
        }
    }
}
