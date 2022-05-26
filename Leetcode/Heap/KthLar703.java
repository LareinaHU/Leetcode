package Heap;

import java.util.PriorityQueue;

public class KthLar703 {
    private int k;
    private PriorityQueue<Integer> Heap;

    public KthLar703(int k, int[] nums) {
        this.k = k;
        this.Heap = new PriorityQueue<>();
        for (int i : nums) {
            if (Heap.size() < k || i >= Heap.peek()) {
                Heap.add(i);
            }
            System.out.println(Heap);
            maintainsize();
        }

    }
    public void maintainsize(){
        if (Heap.size() > k) {
            Heap.poll();
        }
    }

    public int add(int val) {
        Heap.add(val);
        maintainsize();
        return Heap.peek();
    }

    /**
     * Your KthLargest object will be instantiated and called as such:
     * KthLargest obj = new KthLargest(k, nums);
     * int param_1 = obj.add(val);
     */

    public static void main(String[] args) {
        int k1 = 3;
        int[] nums1 = {23, 435, 34, 65, 765, 876};
        KthLar703 aa = new KthLar703(k1, nums1);

        int b = aa.add(42);
        System.out.println(b);

    }

}
