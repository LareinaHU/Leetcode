package top100;

public class leetcode688 {
    public int[] deltaX = {1, 1, 2, 2, -1, -1, -2, -2};
    public int[] deltaY = {2, -2, 1, -1, 2, -2, 1, -1};

    public double knightProbability(int n, int k, int row, int column) {

        double[][][] dp = new double[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = 1;
            }
        }
        for (int temp = 0; temp < k; temp++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int dir = 0; dir < 8; dir++) {
                        int x = i + deltaX[dir];
                        int y = j + deltaY[dir];
                        if (x >= 0 && x < n && y >= 0 && y <= n) {
                            dp[i][j][temp] += dp[x][y][temp - 1] / 8;
                        }
                    }
                }
            }
        }
        return dp[row][column][k];
    }
}
