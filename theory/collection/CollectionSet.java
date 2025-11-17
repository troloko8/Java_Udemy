package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {
        // without indexes and unsorted but uniq
        // Set<Integer> nums = new HashSet<Integer>();
        // sorted
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(81);
        nums.add(8);
        nums.add(33);
        nums.add(-1);
        nums.add(9);
        nums.add(81);

        for (Integer n : nums) {
            System.err.println(n);
        }

        // Iterator class
        Collection<Integer> nums2 = new TreeSet<Integer>();

        nums2.add(81);
        nums2.add(8);
        nums2.add(33);
        nums2.add(-1);
        nums2.add(9);
        nums2.add(81);

        Iterator<Integer> values = nums2.iterator();

        while (values.hasNext()) {
            System.err.println(values.next());
        }

    }
}
