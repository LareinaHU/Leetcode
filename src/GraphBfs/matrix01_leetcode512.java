package GraphBfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class matrix01_leetcode512 {
    public int[] deltaX = {0, 1, -1, 0};
    public int[] deltaY = {1, 0, 0, -1};

    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int column = mat[0].length;
        int[][] results = new int[row][column];
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new Coordinate(i, j));
                } else {
                    results[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Coordinate coor = queue.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int newX = coor.x + deltaX[dir];
                    int newY = coor.y + deltaY[dir];
                    if (isValid(mat, newX, newY)) {

                        if (results[newX][newY] > results[coor.x][coor.y] + 1) {
                            results[newX][newY] = results[coor.x][coor.y] + 1;
                            queue.offer(new Coordinate(newX, newY));
                        }
                    }

                }
            }
        }
        return results;
    }

    class Coordinate {
        int x, y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean isValid(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return false;
        }
        return true;
    }
}
