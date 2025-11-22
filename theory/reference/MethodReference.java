package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Some1", "Some2", "Some3");

        List<String> uNames = names.stream()
            // .map(name -> name.toUpperCase())
            .map(String::toUpperCase)
            .toList();
            
        // uNames.forEach(System.out::println);

        // constructor reference
        List<Student> students = new ArrayList<>();

        for (String name : names) {
            students.add(new Student(name));
        }

        students = names.stream()
            .map(name -> new Student(name))
                .toList();
            
        // constructor reference
        students = names.stream()
            .map(Student::new)
                .toList();
    }
}
