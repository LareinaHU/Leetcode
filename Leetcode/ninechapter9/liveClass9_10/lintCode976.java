package ninechapter9.liveClass9_10;

import java.util.HashMap;
import java.util.Map;

public class lintCode976 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int a: A){
            for (int b: B){
                int sum = a + b;
                int fre = map.getOrDefault(sum, 0);
                map.put(sum, fre + 1);
            }
        }

        int cnt = 0;
        for (int c: C){
            for (int d: D){
                int sum = c + d;
                cnt += map.get(-sum);

            }
        }
        return cnt;
    }
}
