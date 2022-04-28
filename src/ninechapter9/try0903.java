package ninechapter9;


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class try0903 {
    static class Point {

        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public static final int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
    public static final int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};

    public static int shortestPath(boolean[][] grid, Point source, Point destination) {
        if (grid == null || grid.length == 0) {
            return -1;
        }
        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(source);
        Map<Integer, Integer> distance = new HashMap<>();
        int n = grid.length;
        int m = grid[0].length;
        distance.put(source.x * m + source.y, 0);
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.x == destination.x && point.y == destination.y) {
                return distance.get(point.x * m + point.y);
            }
            for (int i = 0; i < 8; i++) {
                int adjX = point.x + dx[i];
                int adjY = point.y + dy[i];
                if (!isValid(adjX, adjY, grid)) {
                    continue;
                }
                if (distance.containsKey(adjX * m + adjY)) {
                    continue;
                }
                distance.put(adjX * m + adjY, distance.get(point.x * m + point.y) + 1);
                queue.offer(new Point(adjX, adjY));
            }
        }
        return -1;

    }

    private static boolean isValid(int x, int y, boolean[][] grid) {
//        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
//            return false;
//        }
//        return !grid[x][y];
//    }
       if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length) {
           return !grid[x][y];
       }
       return false;
    }

    public static void main(String[] args) {
        boolean[][] grid = {{false, false, false}, {false, false, false}, {false, false, false}};
        Point source = new Point(2, 0);
        Point destination = new Point(2, 2);
        int k = shortestPath(grid, source, destination);
        System.out.println(k);

    }

}
