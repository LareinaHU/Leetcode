package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public int k;
    public PriorityQueue<Integer> Heap;
    public KthLargest(int k, int[] nums){
        this.k = k;
        this.Heap = new PriorityQueue<>();
        for(int i: nums){
           Heap.offer(i);
        }
        while(Heap.size() > k){
            Heap.poll();
        }
    }

    public int add(int val) {
        Heap.add(val);

        return Heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3243,56,5467,23,56};
        KthLargest K = new KthLargest(5,nums);
        int result = K.add(15);
        System.out.println(result);



    }
}
