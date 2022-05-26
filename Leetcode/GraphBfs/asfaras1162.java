package GraphBfs;

import java.util.*;

public class asfaras1162 {
    static class Coordinate {
        int x, y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[] deltaX = {0, 1, -1, 0};
    int[] deltaY = {1, 0, 0, -1};

    public int maxDistance(int[][] grid) {


        Queue<Coordinate> q = new ArrayDeque<>();
        int n = grid.length;
        //  Set<Integer> visited = new HashSet<>();
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new Coordinate(i, j));
                    visited[i][j] = true;
                }
            }
        }

        int step = -1;
        while (!q.isEmpty()) {
            step++;
            int size = q.size();
            for (int k = 0; k < size; k++) {
                Coordinate index = q.poll();

                for (int i = 0; i < 4; i++) {
                    int newX = index.x + deltaX[i];
                    int newY = index.y + deltaY[i];

                    if (newX < 0 || newX >= grid.length || newY < 0 ||
                            newY >= grid[0].length || grid[newX][newY] == 1 ) {
                        continue;
                    }
                    q.offer(new Coordinate(newX, newY));
                    visited[newX][newY] = true;
                }
            }
        }

        return step == 0 ? -1 : step;
    }
}
