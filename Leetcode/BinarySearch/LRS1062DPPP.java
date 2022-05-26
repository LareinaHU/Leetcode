package BinarySearch;

public class LRS1062DPPP {
    public static int longestRepeatingSubstring(String S) {
        int m = S.length();
        int dp[][] = new int[m + 1][m + 1];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m && i > j; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                    max = Math.max(max, dp[i + 1][j + 1]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String ss = "dfsaffdfdgsfgdfadfafererqerwedsffaddvcv";
        int a = longestRepeatingSubstring(ss);
        System.out.println(a);
    }
}
