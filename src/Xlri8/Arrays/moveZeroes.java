package Xlri8.Arrays;
/*

// The goal is to shift all zeros to the end of the array while keeping the non-zero numbers in their original order, and you must do this without creating a second array.

// You can solve this by using two imaginary markers or pointers: one for scanning through the array (let’s call it the “current” pointer)
// and one for marking where the next non-zero number should be placed (let’s call it the “insert” position).

// Start with both the current pointer and the insert position at index zero, the very beginning of the array.

// Walk through the array one element at a time using the current pointer. For each element, ask: “Is this number zero, or is it non-zero?”

// If the number is non-zero, take it and place it at the current insert position. (If the insert position is different from the current pointer, you are essentially overwriting an earlier spot with a
// useful number, but you won’t lose anything because you’ve already handled what was there.)

// After placing a non-zero number at the insert position, move the insert position forward by one. This marks the next free slot where a future non-zero number should go.

// If the current number is zero, just skip it—do nothing, and let the current pointer advance. The insert position stays where it is, pointing at the spot that still needs a non-zero (or will later become zero).

// Keep doing this until the current pointer has checked every single element in the array. At that point, all non-zero numbers are now packed at the front of the array, in their original relative order.

// The insert position now points to the first index where a zero should be placed. Everything from this position to the end of the array is no longer needed for non-zero numbers.

// Finally, fill every position from the insert position to the end of the array with zeros. Since you haven’t used any extra array, the whole operation is done in-place, and the array now has all zeros moved to the end.

 */
public class moveZeroes {

    public void moveZeroes(int[] nums) {
        int current = 0;
        int insert = 0;
        int n = nums.length;
        while(current < n) {
            if(nums[current] != 0) {
                nums[insert] = nums[current];
                insert++;
                current++;
            }
            else if(nums[current] == 0) {
                current++;
            }
        }

        while(insert < n) {
            nums[insert] = 0;
            insert++;
        }
    }
}
