package Xlri8.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        //if nums2 still has elements left copy them over non need ot copy remining nums1 elemets they are already in place
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

    }
}
/*
Brute force idea – Simply copy all elements of nums2 into the placeholder part of nums1 (indices m to m+n-1), then sort the entire nums1 array

Here’s the optimal O(m + n) approach, explained in 10 simple points:

Idea – Both arrays are already sorted. Instead of merging from the front, fill nums1 from the very back (where the zeros are) by picking the largest remaining element each time.

Three pointers – Use one pointer i at the last actual element of nums1 (index m‑1), one j at the last element of nums2
 (index n‑1), and one k at the very end of nums1 (index m+n‑1).

Compare from the back – Look at nums1[i] and nums2[j]. Whichever is larger goes into the position k in nums1.

Move pointers – After placing the larger number, move that array’s pointer left (decrease i or j) and also move k left to the next free spot.

Repeat – Keep doing this while both i and j are still valid (≥ 0). At each step you’re placing one element in its final sorted position.

Why it’s safe – The back portion of nums1 (the zeros) is initially unused. You’re writing into positions that either held zeros or have already been copied from earlier, so no real nums1 value gets overwritten too soon.

When j runs out first – All elements of nums2 are placed. The remaining nums1 elements are already in the correct positions at the front, so nothing more is needed.

When i runs out first – All original nums1 elements have been placed. The leftover elements of nums2 are smaller than everything already placed, so simply copy them directly into the beginning of nums1.

Edge cases – If m = 0, just copy nums2 into the first n positions of nums1. If n = 0, nums1 is already the result. The algorithm handles both naturally because the loop skips when i or j is negative.

Complexity – This single backward pass touches each element once, giving O(m + n) time, and uses only a few variables (O(1) extra space). It’s the optimal solution that meets the follow‑up requirement perfectly.

*/