package NeetCode250.ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(Map.Entry<Integer,Integer> m : map.entrySet()) {
            int value = m.getValue();
            if(value > 1) return true;
        }
        return false;
    }


    //Better way

    public boolean containsDuplicateBetter(int[] nums) {

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) return true;

            map.put(num,1);
        }

        return false;
    }
}
