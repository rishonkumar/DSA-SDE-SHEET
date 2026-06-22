package Xlri8.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelfBetter(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int[] pref = new int[n];
        pref[0] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }


        int[] suf = new int[n];
        suf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = nums[i + 1] * suf[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = pref[i] * suf[i];
        }
        return ans;
    }

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for(int i = 1 ; i < n ; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffixProduct = 1;
        for(int i = n - 1 ; i>=0 ; i--) {
            ans[i] = ans[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return ans;
    }
}
