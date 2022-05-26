package GraphBfs;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Queue;

public class try1018 {
    static int[] deltaX = {1, 0, 0, -1};
    static int[] deltaY = {0, -1, 1, 0};

    public int shortestBridge(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return -1;
        }
        int indexX = Integer.MAX_VALUE;
        int indexY = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    indexX = i;
                    indexY = j;


                }
            }
        }
        visited[indexX][indexY] = true;
        Queue<Coordinate> firstLand = new ArrayDeque<>();
        firstLand.add(new Coordinate(indexX, indexY));
        while (!firstLand.isEmpty()) {
            int size = firstLand.size();
            for (int i = 0; i < size; i++) {
                Coordinate coor = firstLand.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int newX = coor.x + deltaX[dir];
                    int newY = coor.y + deltaY[dir];
                    if (isValidFirst(grid, newX, newY) && !visited[newX][newY]) {
                        firstLand.offer(new Coordinate(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
        }
        Queue<Coordinate> queue = new ArrayDeque<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (visited[i][j]) {
                    queue.offer(new Coordinate(i, j));
                }
            }
        }

        int count = -1;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Coordinate co = queue.poll();
                for (int dir = 0; dir < 4; dir++) {
                    int newXX = co.x + deltaX[dir];
                    int newYY = co.y + deltaY[dir];
                    if (isValidSecond(grid, newXX, newYY) && !visited[newXX][newYY]) {
                        queue.offer(new Coordinate(newXX, newYY));
                        visited[newXX][newYY] = true;
                    }
                    if (isValidFirst(grid, newXX, newYY) && !visited[newXX][newYY]) {
                        return count;
                    }
                }
            }
        }
        return count;
    }

    private boolean isValidFirst(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        return grid[i][j] == 1;
    }

    private boolean isValidSecond(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }
        return grid[i][j] == 0;
    }


    static class Coordinate {
        int x, y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}