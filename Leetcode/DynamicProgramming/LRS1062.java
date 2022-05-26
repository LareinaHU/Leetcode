package DynamicProgramming;

public class LRS1062 {
    public static int longestRepeatingSubstring(String s) {
        int m = s.length();
        int[][] dp = new int[m + 1][m + 1];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m && j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i+1][j + 1] = dp[i][j] + 1;
                    max = Math.max(max, dp[i + 1][j + 1]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String ss = "abbaba";
        int a = longestRepeatingSubstring(ss);
        System.out.println(a);
    }
}
