package Xlri8.Arrays;

/*
W-i = min(left-max-i , right-max-i) - h[i]
 */
public class TrappingRainWater {

    public int trap(int[] height) {

        if (height == null || height.length < 3) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // new higher wall no water trapped
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

}
