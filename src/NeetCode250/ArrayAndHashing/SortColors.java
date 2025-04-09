package NeetCode250.ArrayAndHashing;
//https://leetcode.com/problems/sort-colors/
public class SortColors {
    /*
i take 0 j  take care 1 k take care 2
if j has 2 swap with k so we can do k-- we got the k pos
if j has 0 swap with i because i will have 0 i++ and j++
if j has 1 then move j++

*/
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                swap(nums, nums[j], nums[k]);
                k--;
            } else if (nums[j] == 0) {
                swap(nums, nums[j], nums[i]);
                i++;
                j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
