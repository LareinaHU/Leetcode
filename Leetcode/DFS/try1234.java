package DFS;

import java.util.Arrays;

public class try1234 {
    public static void main(String[] args) {
        int[][] dp = {{1, 2, 3, 43, 5345}, {234, 35, 346, 5, 768}};
        for (int i[] : dp) {
            for (int j = 0; j < i.length; j++) {
                i[j] = Integer.MAX_VALUE - 1;
            }
        }
        for (int i[] : dp) {
            System.out.println(Arrays.toString(i));
        }
    }
}
