package JUNE06010630;

public class MaxArea0601 {
    public static boolean checked[][];
    public int maxAreaOfIsland(int[][] grid) {
        int max_area = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        checked = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                max_area = Math.max(max_area, area(i, j, grid));
            }
        }
        return max_area;

    }

    public int area(int row, int column, int[][] grid) {
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || checked[row][column] || grid[row][column] == 0) {
            return 0;
        }
        checked[row][column] = true;
        return (1 + area(row + 1, column, grid) + area(row - 1, column, grid) + area(row, column - 1, grid) + area(row, column + 1, grid));

    }
}