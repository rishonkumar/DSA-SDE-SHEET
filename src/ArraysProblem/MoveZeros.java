package ArraysProblem;
//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {

    /*so basically we are moving non zero elements to the left
whnever we see non zero element move it to slow pointer because slow
points to next non zero element
*/
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int slow = 0;

        for (int fast = 0; fast < n; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
