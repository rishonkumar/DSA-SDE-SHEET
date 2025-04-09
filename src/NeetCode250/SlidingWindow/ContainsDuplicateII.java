package NeetCode250.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int currentIndex = i;
                int value = map.get(nums[i]);
                if (Math.abs(currentIndex - value) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    /*
    ✅ Optimized Sliding Window Solution (using HashSet):

Instead of storing indices and computing distances, we:

Maintain a window of size k.

Only store elements in that window.

If an element reappears within the window → return true.

Time complexity remains O(n), but it avoids repeated lookups and subtraction
     */

    public boolean containsNearbyDuplicateOptimized(int[] nums, int k) {

        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) return true;
            window.add(nums[i]);

            // keep the window size at most k

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}


/*
Input: nums = [1,2,3,1], k = 3
Output: true


HashMap first add element with index

If second time if it comes right check the exisiting value and new value which is index

 */
