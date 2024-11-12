package ArraysProblem;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;  // Pointing to the last element in nums1
        int right = 0;  // Pointing to the first element in nums2

        // Swap the elements until nums1[left] <= nums2[right]
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                // Swap nums1[left] and nums2[right]
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
            } else {
                // If nums1[left] <= nums2[right], the arrays are in order
                break;
            }
            left--;
            right++;
        }

        // Sort only the valid elements (first m elements in nums1)
        Arrays.sort(nums1, 0, m);

        // Sort nums2
        Arrays.sort(nums2);

        // Merge nums2 back into nums1 starting from index m
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}
