package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairs373 {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> LL = new ArrayList<>();
        PriorityQueue<List<Integer>> heap = new PriorityQueue<>((n1, n2) -> (n2.get(0) + n2.get(1) - n1.get(0) - n1.get(1)));

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                heap.add(temp);
                if (heap.size() > k) {
                    heap.poll();
                }
            }
        }
        while (!heap.isEmpty()) {
            LL.add(heap.poll());
        }
        return LL;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 8};
        int[] b = {11, 45, 55, 68, 78};
        List LL = kSmallestPairs(a, b, 5);
        System.out.println(LL);
    }
}
