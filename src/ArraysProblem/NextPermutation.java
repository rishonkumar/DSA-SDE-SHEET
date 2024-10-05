package ArraysProblem;

public class NextPermutation {
    /*

**Algorithm Steps**:

1. **Find the Break-point**:
   - Traverse the array backward to find the first index `i` where `nums[i] < nums[i + 1]`.
   - If no such index exists, reverse the entire array (it’s the last permutation).

2. **Swap**:
   - If a break-point exists, find the smallest number greater than `nums[i]` in the right half (`i + 1` to `n - 1`) and swap it with `nums[i]`.

3. **Reverse the Right Half**:
   - Reverse the subarray from `i + 1` to the end to get the next permutation.

**Edge Case**:
- **Input**: `[3, 2, 1]`
  - **Output**: `[1, 2, 3]` (no next permutation; return sorted order)

This approach ensures in-place modification with constant extra memory.
     */
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int index = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        //if break point does not exist
        if(index == -1) {
            reverse(nums,0,n - 1);
            return;
        }
        // find the next greater element and swap it with nums
        for(int i = n - 1 ; i > index ; i--) {
            if(nums[i] > nums[index]) {
                swap(nums,i,index);
                break;
            }
        }

        // Step 3: Reverse the right half
        reverse(nums, index+ 1, n - 1);
    }
    //swap
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
