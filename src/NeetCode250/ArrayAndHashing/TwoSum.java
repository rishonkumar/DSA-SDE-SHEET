package NeetCode250.ArrayAndHashing;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int present = target - nums[i];
            if (map.containsKey(present)) {
                return new int[]{map.get(present), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
