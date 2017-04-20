package Offline.Offline7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Vadym on 23.03.2017.
 */
public class MapStudents {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new TreeMap<>();

        Map treeMap = new TreeMap();

        Map linkedMap = new LinkedHashMap();

        calculateClassRoom(hashMap);
    }

    private static void calculateClassRoom(Map<String, Integer> hashMap) {
        String lastName = "Okun";

        hashMap.put(lastName, 1);
        hashMap.put("Artem", 1);
        hashMap.put("Masha", 2);
        hashMap.put("Sergey", 3);
        hashMap.put("Kate", 1);
        hashMap.put("Betty", 3);
        hashMap.put("Man", 2);
        hashMap.put("Vadym", 3);
        hashMap.put("Taras", 1);
        hashMap.put("Boris", 3);

        for (String key : hashMap.keySet()) {
            System.out.println(key + " teaching in " + hashMap.get(key) + " class");
        }
    }


}
