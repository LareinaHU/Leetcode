package Heap;


import java.util.PriorityQueue;

public class KthlargestinArr215heap {
    public static int FindK(int[] nums, int k) {
        PriorityQueue<Integer> Que = new PriorityQueue<>((a, b) -> a - b);
        for (int i : nums) {
            if (Que.size() < k || i >= Que.peek()) {
                Que.offer(i);
            }
            if (Que.size() > k) {
                Que.poll();
            }
        }
        return Que.peek();
    }
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int c = FindK(a, 2);
        System.out.println(c);

    }
}
