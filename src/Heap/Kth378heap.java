package Heap;

import java.util.PriorityQueue;

public class Kth378heap {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Coord> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        minHeap.offer(new Coord(0, 0, matrix[0][0]));
        boolean[][] visited = new boolean[n][n];
        for (int v = 0; v < k - 1; v++) {
            Coord top = minHeap.poll();
            if (top.i + 1 < n && !visited[top.i + 1][top.j]) {
                visited[top.i + 1][top.j] = true;
                minHeap.offer(new Coord(top.i + 1, top.j, matrix[top.i + 1][top.j]));
            }
            if (top.j + 1 < n && !visited[top.i][top.j + 1]) {
                visited[top.i][top.j + 1] = true;
                minHeap.offer(new Coord(top.i, top.j + 1, matrix[top.i][top.j + 1]));
            }
        }
        return minHeap.peek().val;
    }


public static class Coord {
    int i, j, val;

    Coord(int i, int j, int val) {
        this.i = i;
        this.j = j;
        this.val = val;
    }

}
// should be a nXn matrix, so the following thing will give us an error.
//    public static void main(String[] args) {
//        int[][] matrix = {{8, 14, 1, 45, 46, 0, 56}, {234, 54, 12, 4, 78, 9}};
//        int k = kthSmallest(matrix, 5);
//        System.out.println(k);
//    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int nn = kthSmallest(matrix, 2);
        System.out.println(nn);
    }

}