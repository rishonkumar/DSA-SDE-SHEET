package DestiantionFang.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backTrack(int[] nums, int start, List<Integer>subset, List<List<Integer>>ans) {

        //base case if all the elements are considered, add the current subset to the ans
        if(start == nums.length) {
            ans.add(new ArrayList<>(subset));
            return;
        }
        //include the current element and recursively explore all the paths that branch from this subset
        subset.add(nums[start]);
        backTrack(nums, start + 1, subset, ans);

        //exclude the current element and recursively explore all the paths that branch from this subset
        subset.remove(subset.size() - 1);
        backTrack(nums, start + 1, subset, ans);
    }
}
