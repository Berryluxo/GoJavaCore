package Offline.Ofline6;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;



/**
 * Created by Lina.Burkalo on 09.03.2017.
 */
public class UseCollections {

    public static void main(String[] args) {

        LinkedList c = new LinkedList();
        c.add("Some");
        c.add("Some");
        c.add("Some");
        c.add("Some");

        List list = new ArrayList(c);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
