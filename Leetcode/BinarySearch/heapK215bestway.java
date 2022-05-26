package BinarySearch;

import java.util.PriorityQueue;

public class heapK215bestway {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        for (int x : nums) {
            if (PQ.size() < k || PQ.peek() <= x){
                PQ.offer(x);
            }
            if(PQ.size()>k){
                PQ.poll();
            }

        }

        return PQ.peek();
    }

}
