package top100;

public class lintcode630 {
//    1 0 1 1 0   n * m
//    0 0 0 0 0
//    1 1 1 1 0
//    0 0 0 0 0
//    1 1 1 1 0
//-------------------->  y
//possible arrive positions{(2, -1), (1,-2), (-2,-1),( -1,-2)}

    //1. deltaX deltaY -- dedcribe the position the knight can be arrived
//2. column by column
//3. dp---dp[i][j] = min(dp[i][j], dp[x][y] + 1)
//4. return dp[n - 1][ m - 1]
    public int[] deltaX = {2, 1, -2, -1};
    public int[] deltaY = {-1, -2, -1, -2};

    public int shortestPath2(boolean[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // write your code here
        //base case
        if (grid == null || grid[0] == null || grid.length == 0 || grid[0].length == 0) {
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
                    dp[i][j] = Integer.MAX_VALUE;
                    continue;
                }
                for (int direction = 0; direction < 4; direction++) {
                    int x = deltaX[direction] + i;
                    int y = deltaY[direction] + j;
                    if (x >= 0 && y >= 0 && x < n && y < m && dp[x][y] != Integer.MAX_VALUE) {
                        dp[i][j] = Math.min(dp[i][j], dp[x][y] + 1);
                    }
                }
            }
        }
        return dp[n - 1][m - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1][m - 1];
    }
}