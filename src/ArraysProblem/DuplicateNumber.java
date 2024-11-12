package ArraysProblem;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                return e.getKey();
            }
        }
        return 0;
    }
}
