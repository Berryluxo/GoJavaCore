package Offline.Ofline6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Lina.Burkalo on 09.03.2017.
 */
public class Group {

    private List<Shape> list = new ArrayList<>();

    public static void add(Shape shapes) {

    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public void add(Shape shape) {
        return list.add(shape);

    }

    public boolean removeAll(Collection c) {
        return false;
    }
}
