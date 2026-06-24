package Xlri8.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        //s1
        reverse(nums, 0, n - 1);
        //s2
        reverse(nums, 0, k - 1);
        //s3
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}


/*
nums = [1,2,3,4,5,6,7], k = 3
Initial:
n = 7, k = 3 % 7 = 3
Array: [1, 2, 3, 4, 5, 6, 7

Step 1: Reverse whole array (0 to 6)
Result: [7, 6, 5, 4, 3, 2, 1]
Step 2: Reverse first k elements (0 to 2)
Result: [5, 6, 7, 4, 3, 2, 1]
Step 3: Reverse remaining n-k elements (3 to 6)
Result: [5, 6, 7, 1, 2, 3, 4]




 */