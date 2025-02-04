package DestiantionFang.BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public List<List<Integer>>permute(int[] A) {

        List<List<Integer>>result = new ArrayList<>();
        backTrack(A, new ArrayList<>(), new HashSet<>(), result);
        return result;
    }

    private void backTrack(int[] nums, List<Integer>candidate, Set<Integer> used, List<List<Integer>> result) {

        //If the current candidate is a complete permutation add it to the result
        if(candidate.size() == nums.length) {
            result.add(new ArrayList<>(candidate));// Add a copy of the candidate
            return;
        }

        for(int num : nums) {

            if(!used.contains(num)) {
                // add num to the current permutation and mark it as used
                candidate.add(num);
                used.add(num);

                //Recursively  explore all branches using the updated permutation candidate
                backTrack(nums, candidate, used, result);

                //backtrack by reversing the changes made
                candidate.remove(candidate.size() - 1);// Remove the last element
                used.remove(num);// Unmark the number as used
            }
        }
    }
}
