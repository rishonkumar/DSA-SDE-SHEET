package ArraysProblem;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {

    /*
    [-2,1,-3,4,-1,2,1,-5,4]

    If any moment sum is -ve make sum = 0

     */
    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) max = sum;

            if (sum < 0) sum = 0;

        }
        return max;
    }
}
