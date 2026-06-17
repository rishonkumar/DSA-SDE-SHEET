package Xlri8.Arrays;

public class majorityElement {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int balance = 0;

        for (int n : nums) {
            if (balance == 0) {
                candidate = n;
                balance++;
            } else if (balance > 0 && candidate == n) {
                balance++;
            } else {
                balance--;
            }
        }
        return candidate;
    }

}
