package Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Meetime253 {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> Heap = new PriorityQueue<>();
        Heap.offer(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= Heap.peek()) {
                Heap.poll();
            }
            Heap.offer(intervals[i][1]);
        }
        return Heap.size();

    }
}

