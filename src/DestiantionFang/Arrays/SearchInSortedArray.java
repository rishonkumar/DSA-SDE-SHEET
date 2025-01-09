package DestiantionFang.Arrays;

public class SearchInSortedArray {

    public int search(int[] A, int T) {

        int left = 0, right = A.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == T) {
                return mid;
            }

            //find which portion of mid is sorted
            if (A[left] <= A[mid]) {
                //Check target lies in this range
                if (T < A[left] || T > A[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (T > A[right] || T < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
