package NeetCode250.ArrayAndHashing;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int cnt = 0;
        Integer majority = null;

        for (int i = 0; i < nums.length; i++) {

            if (cnt == 0) {
                cnt = 1;
                majority = nums[i];
            } else if (nums[i] == majority) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return majority;
    }


    //code style similar to Majority element 2

    public int majorityElement1(int[] nums) {
        int n = nums.length;
        int count = 0;
        Integer maj = null;

        for (int i = 0; i < n; i++) {
            if (maj != null && nums[i] == maj) {
                count++;
            } else if (count == 0) {
                maj = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        return maj;
    }
}
