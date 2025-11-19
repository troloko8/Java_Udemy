package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8);

        System.err.println(nums);

        // Using Consumer it's a waht underhood of forEach method
        Consumer<Integer> con = new Consumer<Integer>() {
            
            public void accept(Integer n) {
                System.err.println( n);
            }
        };

        nums.forEach(con);
        System.err.println("-------------------");
        nums.forEach(n -> System.err.println(n));
    }
}
