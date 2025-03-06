package DestiantionFang.Stackss;

import java.util.Stack;

public class NextGreaterElementII {

    /*
    Add in hashmap for the current index but since it is circular array, we need to iterate through the array twice

     a b c d e f
     So when we take f we need to process a b  d e right so we will do that before cha

     first before processing we will check all the element on the left
     n - 2 to 0 we will do 2 operation push and pop

     Once done then we will create answer starting loop from n - 1 to 0  Operation - (pop answer push)
     */

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 2; i >= 0; i--) {
            // - +
            while (stack.size() > 0 && stack.peek() <= nums[i]) {
                stack.pop();
            }
            stack.push(nums[i]);
        }

        int ans[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            // - +
            while (stack.size() > 0 && stack.peek() <= nums[i]) {
                stack.pop();
            }
            ans[i] = stack.size() == 0 ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return ans;
    }
}
