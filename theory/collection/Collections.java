package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(8);
        nums.add(2);
        nums.add(-1);
        nums.add(9);

        // LIST

        List<Integer> listedNums = new ArrayList<Integer>();
        listedNums.add(8);
        listedNums.add(2);
        listedNums.add(-1);
        listedNums.add(9);

        int secondIndex = listedNums.get(2);

        System.err.println("2d: " + secondIndex);
        

        for (Integer n : nums) {
            System.err.println(n);
        }
    }
}
