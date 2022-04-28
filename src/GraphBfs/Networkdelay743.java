package GraphBfs;

import java.util.*;

public class Networkdelay743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<Cell>> map = new HashMap<>();
        for (int[] time : times) {
            List<Cell> edges = map.getOrDefault(time[0], new ArrayList<>());
            edges.add(new Cell(time[1], time[2]));
            map.put(time[0], edges);
        }

        Map<Integer, Integer> costs = new HashMap<>();
        PriorityQueue<Cell> heap = new PriorityQueue<>();
        heap.offer(new Cell(k, 0));
        while (!heap.isEmpty()) {
            Cell cur = heap.poll();
            if (costs.containsKey(cur.node)) continue;
            costs.put(cur.node, cur.time);
            if (map.containsKey(cur.node)) {
                for (Cell nei : map.get(cur.node)) {
                    if (!costs.containsKey(nei.node)) {
                        heap.offer(new Cell(nei.node, cur.time + nei.time));
                    }

                }
            }
        }
        if (costs.size() != n) return -1;
        int res = 0;
        for (int x : costs.values()) {
            res = Math.max(res, x);
        }
        return res;
    }

}

class Cell implements Comparable<Cell> {
    int node, time;

    Cell(int node, int time) {
        this.node = node;
        this.time = time;
    }

    @Override
    public int compareTo(Cell c2) {
        return time - c2.time;
    }
}