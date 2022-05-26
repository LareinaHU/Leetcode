package top100;

import java.util.Stack;

public class dailyttemperatureStack739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] ans = new int[l];

        Stack<Integer> stack = new Stack<>();

        for (int i = l - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();

            }

            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}

