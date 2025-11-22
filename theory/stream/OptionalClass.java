package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c", "d");

        Optional<String> name = names.stream()
            .filter(str -> str.contains("x"))
            .findFirst();

        System.err.println(name.orElse("Name is not Found"));
    }
}
