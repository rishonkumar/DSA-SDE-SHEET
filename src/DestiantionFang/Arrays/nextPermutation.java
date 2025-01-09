package DestiantionFang.Arrays;

public class nextPermutation {

    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while(nums[j] >= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }


    //swap
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while(start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}

/*
Here's how I would explain the intuition in an interview setting:

"Let me explain the intuition using an example like [1,5,8,4,7,6,5,3,1].

First, let's think about what makes a permutation 'next'. We want the smallest number that's larger than our current number. Here's how we can think about it:

1. **Pattern Recognition**:
   - Looking from right to left, when numbers are in descending order, we can't make a larger number using just those digits
   - In our example: [...,7,6,5,3,1] is descending
   - So, we need to find the first number that breaks this pattern - that's our opportunity to make a larger number

2. **Finding the Breaking Point**:
   - Think of it like finding where we can make our number bigger
   - When we find 4 in our example, we see it's smaller than 7
   - This is our chance! We know we can make a larger number by changing something here

3. **Making the Smallest Increase**:
   - Once we find this position, we want to make the smallest possible increase
   - We only need to swap with the smallest number that's larger than our breaking point
   - In our case, we swap 4 with 5

4. **Minimizing the Rest**:
   - After our swap, we want the rest of the numbers to be as small as possible
   - That's why we reverse everything after our swap position
   - This gives us the smallest possible arrangement of those digits

Think of it like finding a number in a phone book - we want the next page, not ten pages later. We make the smallest possible change that gives us a larger number."

I would then add a concrete example:
"Let me show with a simpler example: [1,2,4,3]
- Looking from right: 3,4 - we see 2 is smaller than 4
- We swap 2 with 3 (smallest number larger than 2)
- Get [1,3,4,2]
- Reverse everything after 3
- Final result: [1,3,2,4]"

This explanation focuses on the logical thinking process rather than just the implementation details, which is often what interviewers are looking for.
 */
