package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ColleactionAPIMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        // Hashtable is better for Threads because it is syncronized one
        // Map<String, Integer> students = new Hashtable<>();

        students.put("name1", 10);
        students.put("name2", 20);
        students.put("name3", 30);
        students.put("name4", 40);
        students.put("name5", 50);
        students.put("name1", 60);

        System.err.println(students.get("name1"));
        System.err.println(students);

        System.err.println(students.keySet());

        for (String key : students.keySet()) {
            System.err.println(key + " : " + students.get(key));
        }
    }
}
