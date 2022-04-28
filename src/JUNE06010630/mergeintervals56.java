package JUNE06010630;

import java.util.*;

public class mergeintervals56 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < intervals.length; i++) {
            if (stack.isEmpty() || stack.peek()[1] < intervals[i][0]) {
                stack.add(intervals[i]);
            } else {
                int[] temp = stack.pop();
                int max = Math.max(temp[1], intervals[i][1]);
                stack.add(new int[]{temp[0], max});
            }
        }
        int[][] res = new int[stack.size()][2];
        stack.toArray(res);
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{4, 5}, {6, 7}, {8, 9}, {1, 10}};
        int[][] k = merge(intervals);
        for (int[] i : k) {
            System.out.println(Arrays.toString(i));
        }
    }
}
