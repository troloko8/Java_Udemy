package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {
        int size = 10_000_000;
        List<Integer> nums = new ArrayList<>(size);
        
        Random ran = new Random();

        for(int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }

        // System.err.println(nums);


        long startStream1 = System.currentTimeMillis();
        int sum1 = nums.stream()
            .map(i -> i * 2)
            .reduce(0, (a,b) -> a + b);

        long startStream2 = System.currentTimeMillis();
        int sum2 = nums.stream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();

        long startStream3 = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();

        long endTime = System.currentTimeMillis();

        // System.err.println(sum1 + "   " + sum2  + "   " + sum3);
        // System.err.println(sum2 + "   " + sum3);
        System.err.println("Time stream REDUCE: " + (startStream2 - startStream1));
        System.err.println("Time Sream: " + (startStream3 - startStream2));
        System.err.println("Time Parall : " + (endTime - startStream3));
    }
}
