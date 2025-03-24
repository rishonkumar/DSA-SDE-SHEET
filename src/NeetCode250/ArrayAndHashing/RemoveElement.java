package NeetCode250.ArrayAndHashing;

public class RemoveElement {
//https://leetcode.com/problems/remove-element/
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
