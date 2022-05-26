package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode56 {
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0 || intervals[0] == null || intervals[0].length == 0) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        int[] curr = intervals[0];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] > curr[1]) {
                list.add(curr);
                curr = intervals[i];
            } else {
                curr[1] = Math.max(curr[1], intervals[i][1]);
            }
        }
        list.add(curr);
        return list.toArray(new int[list.size()][2]);

    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

}
