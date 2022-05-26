package GraphBfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class shortestbridge934 {
    class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Solution {

        int[] xDir = {1, -1, 0, 0};
        int[] yDir = {0, 0, 1, -1};

        public int ShortestBridge(int[][] A) {

            if (A == null || A.length == 0 || A[0] == null || A[0].length == 0) {
                return 0;
            }

            int m = A.length;
            int n = A[0].length;
            int xIndex = 0;
            int yIndex = 0;
            boolean[][] visited = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == 1) {
                        xIndex = i;
                        yIndex = j;
                    }
                }
            }

            visited[xIndex][yIndex] = true;
            Queue<Point> firstIsland = new LinkedList<>();
            firstIsland.add(new Point(xIndex, yIndex));

            while (!firstIsland.isEmpty()) {
                int size = firstIsland.size();
                // System.out.println(size);
                for (int index = 0; index < size; index++) {
                    Point current = firstIsland.poll();
                    int currentX = current.x;
                    int currentY = current.y;
                    for (int jIndex = 0; jIndex < 4; jIndex++) {
                        int nextX = currentX + xDir[jIndex];
                        int nextY = currentY + yDir[jIndex];
                        if (isValidOne(nextX, nextY, A) && !visited[nextX][nextY]) {
                            // System.out.println("Not here");
                            firstIsland.add(new Point(nextX, nextY));
                            visited[nextX][nextY] = true;
                        }
                    }
                }
            }

            Queue<Point> queue = new LinkedList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j]) {
                        queue.add(new Point(i, j));
                    }
                }
            }

            int flipCount = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Point current = queue.poll();
                    int currentX = current.x;
                    int currentY = current.y;

                    for (int j = 0; j < 4; j++) {
                        int nextX = currentX + xDir[j];
                        int nextY = currentY + yDir[j];
                        if (isValidZero(nextX, nextY, A) && !visited[nextX][nextY]) {
                            queue.add(new Point(nextX, nextY));
                            visited[nextX][nextY] = true;
                        }

                        if (isValidOne(nextX, nextY, A) && !visited[nextX][nextY]) {
                            return flipCount;
                        }

                    }

                }

                flipCount++;

            }

            return flipCount;

        }

        private boolean isValidOne(int nextX, int nextY, int[][] A) {
            int m = A.length;
            int n = A[0].length;
            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && A[nextX][nextY] == 1) {
                return true;
            }
            return false;
        }

        private boolean isValidZero(int nextX, int nextY, int[][] A) {
            int m = A.length;
            int n = A[0].length;
            if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n && A[nextX][nextY] == 0) {
                return true;
            }
            return false;
        }
    }
}