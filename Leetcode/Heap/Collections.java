package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Collections {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Heap =new PriorityQueue<>();
        for(int i : nums){
            if(Heap.size() < k||i >= Heap.peek()){
                Heap.offer(i);
            }

        }
        return Heap.peek();

}
}
