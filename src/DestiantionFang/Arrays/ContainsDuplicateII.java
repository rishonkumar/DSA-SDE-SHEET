package DestiantionFang.Arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class ContainsDuplicateII {

    /*
    BF
    Pick any element and check till k element and keep checking for other element
    Basically for every element compare with k's element
    O(n)*K TC

    Better
    Divide oen element into k windows and sort and use binary search

    [0,5,2,7,3,1,6]

     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                //The line set.remove(nums[i - k]) ensures that elements
                // outside the sliding window of size k are removed,
                // maintaining a maximum size of k
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
