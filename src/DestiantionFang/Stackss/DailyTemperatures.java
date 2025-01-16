package DestiantionFang.Stackss;

import java.util.Stack;

public class DailyTemperatures  {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer>stack = new Stack<>();

        for(int i = 0 ; i < temperatures.length ; i++) {

            // Check if the stack is not empty and the current temperature is greater than the temperature
            // at the index stored at the top of the stack.
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
