package Xlri8.Arrays;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int n = height.length;

        int i = 0, j = n - 1;
        int maxArea = 0;

        while (i < j) {
            int w = j - i;

            int h = Math.min(height[i], height[j]);
            int area = w * h;
            maxArea = Math.max(area, maxArea);

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }

        }
        return maxArea;
    }
}
