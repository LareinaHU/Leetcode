package GraphBfs;

import java.util.Arrays;

public class graph1162 {
    private final int[][] DIRECTIONS = {{-1,0},{1,0},{0,1},{0,-1}};
    private int[][] distance;

    public int maxDistance(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int m = grid.length, n = grid[0].length;
        distance = new int[m][n];

        for (int[] d: distance) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    distance[i][j] = 0;//calculate all distances for the neighbors of the land.
                    for (int[] d: DIRECTIONS) {
                        if (isValid(grid, i + d[0], j + d[1]) && grid[i + d[0]][j+d[1]] == 0) {
                            // if neighbors are water, mark distance to 1.
                            distance[i+d[0]][j+d[1]] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) { //water
                    distance[i][j] = getDistance(grid, i, j);
                    if (distance[i][j] != Integer.MAX_VALUE)
                        max = Math.max(max, distance[i][j]);
                    // grid[i][j] = -1;//mark as visited;
                }
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }

    private int getDistance(int[][] grid, int i, int j) {
        int minDis = Integer.MAX_VALUE;
        if (distance[i][j] == 1 )
            return distance[i][j];

        for (int[] d: DIRECTIONS) {
            if (isValid(grid, i + d[0], j + d[1]) && distance[i+d[0]][j+d[1]] != Integer.MAX_VALUE) {

                minDis = Math.min(minDis, distance[i+d[0]][j+d[1]] + 1);
            }
        }

        return minDis;

    }

    private boolean isValid(int[][] grid, int i, int j) { //go check if its visited or not.
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return false;
        return true;
    }

    class Position {
        int x;
        int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
