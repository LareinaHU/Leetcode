package Heap;

import java.util.*;

public class Kcloset973 {
    public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((o1, o2) -> o2[0] * o2[0] + o2[1] * o2[1] - (o1[0] * o1[0] + o1[1] * o1[1]));
        for (int i = 0; i < points.length; i++) {
            heap.offer(points[i]);
            if (heap.size() > K) {
                heap.poll();
            }
        }
        int[][] ans = new int[K][2];
        for (int j = 0; j < K; j++) {
            ans[j] = heap.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] aa = {{-3, 3}, {5, 6}, {4, 5}, {2, 4}, {5, 7}, {1, 7}};
        int[][] ans = kClosest(aa, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
