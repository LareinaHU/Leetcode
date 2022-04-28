package BinarySearch;

import java.util.PriorityQueue;

public class maxheap215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int x : nums) {
            heap.offer(x);
        }
        for (int i = 1; i < nums.length+1-k; i++) {
            heap.poll();
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        int c = findKthLargest(a, 2);
        System.out.println(c);
    }
}
