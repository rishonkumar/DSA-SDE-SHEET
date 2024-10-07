package src.ArraysProblem;
//https://leetcode.com/problems/sort-colors/
public class SortColors {
    /*
    arr[0….low-1] contains 0. [Extreme left part]
    arr[low….mid-1] contains 1.
    arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array

    If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid.
     Now the subarray from index 0 to (low-1) only contains 0.
    If arr[mid] == 1, we will just increment the mid pointer and then the index
    (mid-1) will point to 1 as it should according to the rules.
    If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high.
    Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after
swapping, the subarray from mid to high(after decrementing high) might be unsorted.
So, we will check the value of mid again in the next iteration.

     */
    public void sortColors(int[] arr) {
        int size = arr. length;
        int i = 0 , j = 0 , k = size - 1;

        while(j <= k) {
            if(arr[j] == 0) {
                swap(i,j,arr);
                i++;
                j++;
            }
            else if(arr[j] == 1) {
                j++;
            } else {
                swap(j,k, arr);
                k--;
            }
        }
    }

    void swap(int a, int b, int[] arr) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }


}
