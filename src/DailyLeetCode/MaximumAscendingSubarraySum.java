package DailyLeetCode;

//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/?envType=daily-question&envId=2025-02-04
public class MaximumAscendingSubarraySum {
    /*
    [10,20,30,5,10,50]

     */
    public int maxAscendingSumBf(int[] nums) {

        int maxSum = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            int j = i + 1;
            while (j < n && nums[j] > nums[j - 1]) {
                sum += nums[j];
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public int maxAscendingSum(int[] nums) {

        int n = nums.length;
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 1; i < n; i++) {

            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }
        return Math.max(maxSum, sum); //Because last element is out of bound since it will not go into for loop
    }

}
