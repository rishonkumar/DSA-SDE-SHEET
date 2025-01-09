package DestiantionFang.Arrays;

public class RotatedSortedArray {

    public int findMin(int[] A) {

        int left = 0;
        int right = A.length - 1;
        int ans = A[0];

        if(A.length == 1) return A[0];
        while (left <= right) {

            if(A[left] < A[right]) {
                ans = Math.min(ans,A[left]);
            }
            int mid = (left+right)/2;
            ans = Math.min(ans,A[mid]);
            /*
        In a rotated sorted array:
        One side (left or right) of the middle element (A[mid]) will always be sorted because
        the array was originally sorted before rotation.
        The pivot point (minimum element) will be in the unsorted part of the array.
        Using the condition A[left] <= A[mid], we can determine which part (left or right) is sorted,
        and then eliminate that half from consideration.
             */
            if(A[left] <= A[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
