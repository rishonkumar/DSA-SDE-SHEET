package Xlri8.Arrays;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinRotatedArray {

    public int findMin(int[] nums) {

        int ans = -1;

        int low = 0;
        int high = nums.length - 1;

        if(nums.length <=1) return nums[0];

        while(low < high) {
            int mid = (low + high) / 2;

            //case 1
            if(nums[mid] > nums[high]) {
                //move left to mid + 1
                low = mid + 1;
            } else {
                high = mid;
            }

            ans = nums[low];

        }
        return ans;
    }
}

/*
Problem – The array was originally sorted in ascending order, then rotated. This creates two sorted parts: a higher‑valued left part and a lower‑valued right part. The minimum element is the “pivot” where the order drops.

Why binary search? – Even though the array is rotated, you can still eliminate half of the elements at each step by comparing the middle element with the rightmost element. That gives O(log n) time.

Pointers – Use two pointers, low at the start and high at the end of the current search range. Initially, low = 0 and high = n-1.

Mid element – Find the middle index mid between low and high. Look at nums[mid].

Key comparison – Compare nums[mid] with nums[high] (the rightmost element of the current range). This tells you which half is sorted and where the minimum lies.

Case 1: nums[mid] > nums[high] – The middle element is larger than the rightmost. That means the rotation point (and thus the minimum) must be to the right of mid. So move low to mid + 1.

Case 2: nums[mid] < nums[high] – The middle element is smaller than the rightmost. This means the right half is sorted, and the minimum is either at mid or somewhere to the left of mid. So move high to mid.

Why not use nums[low]? – Comparing with nums[high] is safer because it always tells you whether the minimum is in the right unsorted part or the left sorted part. Comparing with nums[low] can be ambiguous when the array is not rotated.

Loop until pointers meet – Keep narrowing the range until low == high. At that point, the search range has shrunk to a single element, which must be the minimum.

Return the minimum – The element at low (or high, since they’re equal) is the smallest value in the rotated array. The algorithm runs in O(log n) time and O(1) space.
 */