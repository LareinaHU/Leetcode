package DP1;

public class DPlintcode630 {
    public static final int[] deltaX = {-2, -1, 1, 2};
    public static final int[] deltaY = {-1, -2, -2, -1};
// 0 0 0 4 0
// 0 0 4 0 0    for(int dir: 4)
// 0 0 0 0 0   dp[i][j] = Math.min(dp[i][j],dp[x][y] + 1);
// 0 0 4 0 0
// 0 0 0 4 0

    public int shortestPath2(boolean[][] grid) {
        // write your code here
        int n = grid.length;
        int m = grid[0].length;

        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return -1;
        }
        int[][] dp = new int[n][m];
        for (int i[] : dp) {
            for (int j = 0; j < i.length; j++) {
                i[j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (grid[i][j]) {
                    continue;
                }
                for (int direction = 0; direction < 4; direction++) {
                    int x = i + deltaX[direction];
                    int y = j + deltaY[direction];
                    if (x > -1 && x < n && y > -1 && y < m && dp[x][y] != Integer.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i][j], dp[x][y] + 1);
                    }
                }

            }
        }
        return dp[n - 1][m - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1][m - 1];
    }
}

