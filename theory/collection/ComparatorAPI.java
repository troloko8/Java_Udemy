package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

class Student implements Comparable<Student> {
    int age;
    String name;

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
                return 1;
        }

        return -1;
    }
}

public class ComparatorAPI {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j) {
        //         if (i%10 > j%10) {
        //             return 1;
        //         }

        //         return -1;
        //     }
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(43);

        // Collections.sort(nums, com);
        // System.err.println(nums);

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                }

                return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "name1"));
        studs.add(new Student(12, "name2"));
        studs.add(new Student(18, "name3"));
        studs.add(new Student(20, "name4"));

        // Collections.sort(studs, com);
        Collections.sort(studs);
        // System.err.println(nums);

        for (Student student : studs) {
            System.err.println(student);
        }
    }
}
