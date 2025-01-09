package DestiantionFang.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    BF -> Target - A[i] check if other no is present or not
    TC - (n/n)

   Better
   Sort the array
   We can search other element or not using binary search O(N(logN))

   Target - 13

   T - a[{] /// check if


   More better
   Use HashMao num,Index as Key value
    TC  O(n) SC - O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
