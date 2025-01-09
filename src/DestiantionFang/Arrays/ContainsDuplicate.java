package DestiantionFang.Arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {

    /*
    Brute force -> COmpare with other elements if present then return true
    O(n2)

    Using sorting compare adjacent element TC - O(nlogn)

    Optimal Use Hashset if the elements we are adding is present in set then return true
    TC- O(N) SC - O(n)
     */

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(nums[i])) return true;
            else visited.add(nums[i]);
        }
        return false;
    }

}
