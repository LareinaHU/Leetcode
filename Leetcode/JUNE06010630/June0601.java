package JUNE06010630;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class June0601 {
    public static int minCost(int[][] costs) {

        if (costs.length == 0) return 0;
        int[][] dp = new int[costs.length][3];
        dp[0] = costs[0];
        for (int i = 1; i < costs.length; i++) {
            dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);

        }

        return Math.min(dp[costs.length - 1][2], Math.min(dp[costs.length - 1][0], dp[costs.length - 1][1]));
    }



    public static void main(String[] args) {
        int[][] costs = {{3, 5, 3}, {6, 17, 6}, {7, 13, 18}, {9, 10, 18}};
        int k = minCost(costs);
        System.out.println(k);
    }
}