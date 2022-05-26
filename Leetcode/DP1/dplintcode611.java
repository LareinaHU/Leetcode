package DP1;

import java.util.ArrayDeque;
import java.util.Queue;

public class dplintcode611 {

    class Point {
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
    public static final int[] deltaX = {1, 1, 2, 2, -1, -1, -2, -2};
    public static final int[] deltaY = {2, -2, 1, -1,2, -2, -1, 1};

    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        // write your code here
        if(grid == null || grid.length == 0|| grid[0] == null || grid[0].length == 0){
            return -1;
        }
        int count  = -1;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Point> queue = new ArrayDeque<>();
        grid[source.x][source.y] = true;
        queue.offer(source);
                while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Point curr = queue.poll();
                if(curr.x == destination.x && curr.y == destination.y){
                    return count;
                }
                for(int direction = 0; direction < 8; direction++){
                    Point next = new Point();
                    next.x = curr.x + deltaX[direction];
                    next.y = curr.y + deltaY[direction];
                    if(next.x > -1 && next.x < m && next.y > -1 && next.y < n && !grid[next.x][next.y]){
                        queue.offer(next);
                    }

                }
            }
        }
        return -1;
    }
}
