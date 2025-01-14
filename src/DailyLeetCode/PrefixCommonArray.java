package DailyLeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrefixCommonArray {

    public static int[] findThePrefixCommonArrayBF(int[] A, int[] B) {

        int n = A.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            Set<Integer> seenA = new HashSet<>();
            Set<Integer> seenB = new HashSet<>();

            for (int j = 0; j <= i; j++) {
                seenA.add(A[j]);
                seenB.add(B[j]);
            }

            int cnt = 0;
            for (Integer num : seenA) {
                if (seenB.contains(num)) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int[] res = new int[n];
        HashMap<Integer,Integer>map = new HashMap<>();

        int cnt = 0;
        for(int i = 0 ; i < n ; i++) {

            map.put(A[i], map.getOrDefault(A[i],0) + 1);
            if(map.get(A[i]) == 2) {
                cnt++;
            }

            map.put(B[i], map.getOrDefault(B[i],0) + 1);
            if(map.get(B[i]) == 2) {
                cnt++;
            }


            res[i] = cnt;
        }
        return res;
    }
}
