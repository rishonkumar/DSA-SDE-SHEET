package Xlri8.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /*
    n1 + n2 + n3 = 0
    We can convert this to two sum by
    n3 + n2 = (-n1 )   => Target = -n1

    Sorting
    Duplicates
    Fixed n1 duplicates avoid

     */
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        if (n < 3) {
            return new ArrayList<>();
        }

        //sort
        Arrays.sort(nums);

        //fixing one element : n1
        for (int i = 0; i < n; i++) {
            //avoid n1 duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int n1 = nums[i];
            int target = -n1;

            twoSum(nums, target, i + 1, n - 1); // it will find n1 n2 n3
        }
        return result;
    }

    private void twoSum(int[] nums, int target, int i, int j) {
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                //first we will remove duplicates from either end
                while (i < j && nums[i] == nums[i + 1]) i++;
                while (i < j && nums[j] == nums[j - 1]) j--;

                result.add(Arrays.asList(-target, nums[i], nums[j]));
                i++;
                j--;
            }

        }
    }
}
