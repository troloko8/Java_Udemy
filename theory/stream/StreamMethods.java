package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int res = s3.reduce(0, (a, b) -> a + b);

        // System.err.println(res);

        // Elegant way
        int res = nums.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * 2)
            .reduce(0, (a, b) -> a + b);  
        System.err.println(res);

    }
}
