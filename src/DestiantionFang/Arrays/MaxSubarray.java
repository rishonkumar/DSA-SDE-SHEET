package DestiantionFang.Arrays;

public class MaxSubarray {

    public int maxSubArray(int[] A) {

        int currSum = 0;
        int maxSum = A[0];

        for(int i = 0 ; i < A.length ; i++) {
            if(currSum < 0) currSum = 0;

            currSum = currSum + A[i];
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

}
