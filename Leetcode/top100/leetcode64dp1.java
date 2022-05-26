package top100;

public class leetcode64dp1 {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for (int i  = 1; i < grid[0].length; i++){
            grid[0][i] += grid[0][i - 1];
        }
        for(int j = 1; j < grid.length; j++){
            grid[j][0] += grid[j - 1][0];
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                    int k1 = grid[i - 1][j] + grid[i][j];
                    int k2 = grid[i][j - 1] + grid[i][j];
                    grid[i][j] = Math.min(k1, k2);
                }
            }

        return grid[row - 1][column - 1];
    }
}
