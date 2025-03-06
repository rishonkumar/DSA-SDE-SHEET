package DestiantionFang.Stackss;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElementBF(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        // Iterate through each element in nums1
        for (int i = 0; i < nums1.length; i++) {
            int currentElement = nums1[i];
            int nextGreater = -1;

            // Find the index of currentElement in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == currentElement) {
                    // Look for the next greater element to the right
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > currentElement) {
                            nextGreater = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            result[i] = nextGreater;
        }

        return result;
    }

    public int[] nextGreaterElement(int[] A, int[] B) {
        // Map to store the next greater element for each number in B
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 (B) from right to left to calculate next greater elements
        for (int i = B.length - 1; i >= 0; i--) {
            // Remove elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && stack.peek() <= B[i]) {
                stack.pop();
            }
            // If the stack is empty, no greater element exists
            if (stack.isEmpty()) {
                nextGreaterMap.put(B[i], -1);
            } else {
                // Top of the stack is the next greater element
                nextGreaterMap.put(B[i], stack.peek());
            }
            // Push the current element onto the stack
            stack.push(B[i]);
        }

        // Build the result array for nums1 (A) by querying the map
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = nextGreaterMap.get(A[i]);
        }

        return result;
    }

}
