package reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Some1", "Some2", "Some3");

        List<String> uNames = names.stream()
            // .map(name -> name.toUpperCase())
            .map(String::toUpperCase)
            .toList();
            
        uNames.forEach(System.out::println);
    }
}
