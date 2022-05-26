package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class bfslintcode611 {
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
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        int n = grid.length,m = grid[0].length;
        if (n == 0 || m == 0) {
            return -1;
        }

        int[] dx = {1, 1, 2, 2, -1, -1, -2, -2};
        int[] dy = {2, -2, 1, -1, 2, -2, 1, -1};
        Queue<Point> queue = new LinkedList<>();
        queue.offer(source);
        grid[source.x][source.y] = true;
        int ans = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Point cur = queue.poll();
                //到达终点，返回距离
                if (cur.x == destination.x && cur.y == destination.y)  {
                    return ans;
                }
                for (int i = 0; i < 8; i++) {
                    Point next = new Point (
                            cur.x + dx[i],
                            cur.y + dy[i]
                    );
                    //判断下一条可否到达
                    if (is_in_bound(next,n,m) && grid[next.x][next.y] == false) {
                        queue.offer(next);
                        grid[next.x][next.y] = true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }
    //判断是否越界
    private boolean is_in_bound(Point next,int n,int m) {
        return 0 <= next.x && next.x < n && 0 <= next.y && next.y < m;
    }
}

