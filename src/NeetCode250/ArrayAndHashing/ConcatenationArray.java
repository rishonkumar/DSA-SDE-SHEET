package NeetCode250.ArrayAndHashing;

public class ConcatenationArray {


    public int[] getConcatenationBF(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[i];
        }
        return ans;
    }

    /*
    Optimised approach  use modulo apprach
     */


    public int[] getConcatenation(int[] A) {


        int n = A.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = A[i % n];
        }
        return ans;
    }

}
