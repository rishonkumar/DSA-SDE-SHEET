package ArraysProblem;

import java.util.Arrays;

public class ChocolateDistribution {

    /*
    Optimized approach is sort the array
    The core idea behind sorting the array of chocolate packets is to
    minimize the difference between the maximum and minimum number of
    chocolates distributed.
       n * log n
     */

    int findMinDiff(int[] arr, int m) {

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i <= arr.length - m ; i++) {
            int minW = arr[i];
            int maxW = arr[i + m - 1];
            int gap = maxW - minW;

            if(gap < ans) {
                ans = gap;
            }
        }
        return ans;
    }
}
