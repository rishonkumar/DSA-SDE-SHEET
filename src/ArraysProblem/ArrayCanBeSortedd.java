package ArraysProblem;

public class ArrayCanBeSortedd {
//https://leetcode.com/problems/find-if-array-can-be-sorted/
    /*
Bubble sort
    Adjacent element
    swap
Here extra conditon swap only if set bit is equal
*/
    public boolean canSortArray(int[] nums) {

        int n = nums.length;
        boolean swapped = true;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {// in every pass, the max element bubbles up to the rightmost index
                if (nums[j] <= nums[j + 1]) {
                    // no swap required
                } else {
                    //swap required and check for bits
                    if (Integer.bitCount(nums[j]) == Integer.bitCount(nums[j + 1])) {
                        int t = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = t;
                        swapped = true;
                    } else {
                        //not able to swap
                        return false;
                    }
                }
            }
            /// no swapping was done in the pass, hence array was already sorted
            if (!swapped) {
                break;
            }
        }
        return true;
    }
}
