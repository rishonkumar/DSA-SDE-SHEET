package Xlri8.Arrays.PrefixSum;

import java.util.HashMap;

public class SubbarySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();

        prefixSumFreq.put(0, 1);
        int currentSum = 0;
        int cnt = 0;

        for (int num : nums) {
            currentSum += num;

            int needed = currentSum - k;
            if (prefixSumFreq.containsKey(needed)) {
                cnt += prefixSumFreq.get(needed); // add all starting points
            }

            //record the current prefix sum for future ending positions
            prefixSumFreq.put(currentSum, prefixSumFreq.getOrDefault(currentSum, 0) + 1);
        }

        return cnt;
    }
}
