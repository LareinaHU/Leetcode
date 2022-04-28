package GraphBfs;

import java.util.*;

public class cheapest787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] flight : flights) {
            List<int[]> to = map.getOrDefault(flight[0], new ArrayList<>());
            to.add(new int[]{flight[1], flight[2]});
            map.put(flight[0], to);
        }
        PriorityQueue<Cell> heap = new PriorityQueue<>();
        heap.offer(new Cell(src, k, 0));
        while(!heap.isEmpty()){
            Cell cur = heap.poll();
            if(cur.dst == dst) return cur.price;
            if(cur.stop >= 0 && map.containsKey(cur.dst)){
                for(int[] next: map.get(cur.dst)){
                    heap.offer(new Cell(next[0], cur.stop - 1, cur.price + next[1]));

                }
            }
        }
        return -1;
    }


    class Cell implements Comparable<Cell> {
        int dst, stop, price;

        Cell(int dst, int stop, int price) {
            this.dst = dst;
            this.stop = stop;
            this.price = price;
        }

        @Override
        public int compareTo(Cell o) {
            return price - o.price;
        }
    }
}
