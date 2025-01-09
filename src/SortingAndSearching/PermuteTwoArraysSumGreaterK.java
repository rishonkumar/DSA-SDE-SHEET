package SortingAndSearching;

import java.util.Arrays;
import java.util.Collections;

//https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/
public class PermuteTwoArraysSumGreaterK {

    static boolean isPossible(Integer[] A, Integer[] B, int n, int k) {

        //sort in decending order
        Arrays.sort(A, Collections.reverseOrder());

        Arrays.sort(B);

        for (int i = 0; i < n; i++) {
            if (A[i] + B[i] < k) return false;
        }
        return true;
    }
}
