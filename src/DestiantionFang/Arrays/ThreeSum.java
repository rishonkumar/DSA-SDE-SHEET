package DestiantionFang.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
   
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //A triplet involving a positive number cannot sum to zero because all elements are non-negative. sp nums[i]<= 0
         for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                twoSum2(nums,i,res);
            }
        }
        return res;
    }

    private void twoSum2(int[] nums, int i, List<List<Integer>> res) {

        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                //This condition ensures that we skip duplicate values for the left pointer
                // to avoid adding duplicate triplets to the result list. Here’s why this is
                // necessary even though you check duplicates in the main loop with:
                while(left < right && nums[left] == nums[left-1]) ++left;
            }
            else if (sum < 0) {
                left++;
            }
            else{
                right--;
            }
        }
    }
}
