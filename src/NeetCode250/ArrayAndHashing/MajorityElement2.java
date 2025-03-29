package NeetCode250.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

/*
There can be at most two such elements (since n/3 + n/3 < 2n/3 < n, leaving no room for a third)

Second Pass (Verification):
Unlike Majority Element I, there’s no guarantee an element exceeds n/3, so we count the actual frequencies of maj1 and maj2.
Add them to the result if they exceed n/3.
 */
public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {

        int cnt1 = 0;
        int cnt2 = 0;

        Integer major1 = null;
        Integer major2 = null;

        for (int num : nums) {
            if (major1 != null && num == major1) {
                cnt1++;
            } else if (major2 != null && num == major2) {
                cnt2++;
            } else if (cnt1 == 0) {
                major1 = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                major2 = num;
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        //second pass count actual freq
        cnt1 = 0;
        cnt2 = 0;

        for (int n : nums) {
            if (major1 != null && n == major1) {
                cnt1++;
            } else if (major2 != null && n == major2) {
                cnt2++;
            }
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (cnt1 > n / 3) ans.add(major1);

        if (cnt2 > n / 3) ans.add(major2);

        return ans;

    }
}
