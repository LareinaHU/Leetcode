package top100;

public class leetcode64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row + 1][column + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1) {
                    dp[i][j] = dp[i][j - 1] + grid[i - 1][j - 1];
                } else if (j == 1) {
                    dp[i][j] = dp[i - 1][j] + grid[i - 1][j - 1];
                } else {


                    int k1 = dp[i - 1][j] + grid[i - 1][j - 1];
                    int k2 = dp[i][j - 1] + grid[i - 1][j - 1];
                    dp[i][j] = Math.min(k1, k2);
                    System.out.println(dp[i][j]);
                }
            }
        }
        return dp[row][column];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        leetcode64 example = new leetcode64();
        int k = example.minPathSum(grid);
        System.out.println("k:  " + k);
    }

}