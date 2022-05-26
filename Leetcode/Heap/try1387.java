package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class try1387 {
    static class Pairs {
        int integerX;
        int Power;

        public Pairs(int integerX, int Power) {
            this.integerX = integerX;
            this.Power = Power;
        }
    }

    public static int count(int integerX) {
        int count = 0;
        while (integerX != 1) {
            if (integerX % 2 == 0) {
                integerX = integerX / 2;
                count++;
            } else {
                integerX = integerX * 3 + 1;
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int getKth(int lo, int hi, int k) {
        PriorityQueue<Pairs> Heap = new PriorityQueue<>(new Comparator<Pairs>() {
            @Override
            public int compare(Pairs a, Pairs b) {
                if (a.Power == b.Power) {
                    return a.integerX - b.integerX;
                }
                return a.Power - b.Power;
            }
        });

        for (int i = lo; i <= hi; i++) {
            Pairs PP = new Pairs(i, count(i));
            Heap.offer(PP);
        }
        for (int i = 0; i < k - 1; i++) {
            Heap.poll();
        }
        return Heap.peek().integerX;

    }

    public static void main(String[] args) {
        int lo = 12, hi = 15, k = 2;
        int result = getKth(lo, hi, k);
        System.out.println(result);
    }
}
