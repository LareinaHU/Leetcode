package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Reorganize767 {
    static class Item {
        int value;
        char pattern;

        public Item(int v, char p) {
            this.value = v;
            this.pattern = p;

        }
    }

    public static String reorganizeString(String S) {
        if (S.length() <= 1) return S;
        PriorityQueue<Item> pq = new PriorityQueue<>((x, y) -> y.value - x.value);
        int[] record = new int[26];
        for (char ch : S.toCharArray()) {
            record[ch - 'a']++;
        }
        System.out.println(Arrays.toString(record));
        int limit = S.length() / 2 + S.length() % 2;
        for (int i = 0; i < 26; i++) {
            if (record[i] > limit) {
                return "";
            }
            if (record[i] > 0) {
                pq.add(new Item(record[i], (char) (i + 'a')));
            }
        }
        return greedyBuild(S.length(), pq);
    }

    private static String greedyBuild(int len, PriorityQueue<Item> pq) {
        char[] ans = new char[len];
        int t = 0;
        while (pq.size() > 0) {
            Item cur = pq.poll();
            for (int i = 0; i < cur.value; i++) {
                if (t >= len) t = 1;
                ans[t] = cur.pattern;
                t += 2;
            }
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        String SS = "sfdgfdgffdaadf";
        String aa= reorganizeString(SS);
    }

}
