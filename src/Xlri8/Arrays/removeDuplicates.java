package Xlri8.Arrays;

public class removeDuplicates {
    public int removeDuplicatess(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0;
        for (int current = 1; current < nums.length; current++) {
            if (nums[current] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[current];
            }
        }
        return uniqueIndex + 1;
    }



    /*
     * Because the array is already sorted, all duplicate values are grouped
     * together — so you just need to keep the first occurrence of each number.
     *
     * Use two pointers (or indices): one to scan the array (let’s call it i), and
     * one to mark the position where the next unique number should go (let’s call
     * it uniqueIndex).
     *
     * Start with both pointers at index 0. The first element is always unique, so
     * it stays in place.
     *
     * Move the scanning pointer i forward, starting from index 1. For each element,
     * check whether it is different from the last placed unique element (the one at
     * uniqueIndex).
     *
     * If nums[i] is equal to nums[uniqueIndex], it’s a duplicate. Do nothing except
     * continue moving i to the next position.
     *
     * When nums[i] is different from nums[uniqueIndex], you’ve found a new unique
     * number.
     *
     * Increment uniqueIndex by one (move to the next free slot).
     *
     * Copy nums[i] into that new slot (nums[uniqueIndex] = nums[i]).
     *
     * Keep repeating steps 5 and 6 until the scanning pointer has walked through
     * the entire array.
     *
     * At the end, all unique numbers sit compactly from index 0 up to uniqueIndex.
     * The value uniqueIndex + 1 equals k, the number of unique elements.
     *
     * The elements after index uniqueIndex can be ignored — the problem allows them
     * to be anything, because only the first k positions matter.
     *
     * The method uses O(1) extra space (just a couple of integer variables) and
     * O(n) time, since each element is visited only once. This satisfies the
     * in‑place requirement perfectly.
     */
}
