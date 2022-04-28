package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemp739 {
    public static int[] dailyTemp(int[] T) {
        int n = T.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) res[i] = 0;
            else res[i] = stack.peek() - i;
            stack.push(i);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] a = {123,324,3,54,6,32,78,7,9675,234};
        int[] b = dailyTemp(a);
        System.out.println(Arrays.toString(b));
    }
}
