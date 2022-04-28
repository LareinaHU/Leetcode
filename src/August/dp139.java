package August;

import java.util.Arrays;
import java.util.List;

public class dp139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int lo = 0; lo < n; lo++) {
            if (!dp[lo]) continue;
            for (String word : wordDict) {
                int hi = lo + word.length();
                if (hi <= n && s.substring(lo, hi).equals(word)) {
                    dp[hi] = true;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String a = "letitgo";
        List<String> b = Arrays.asList(new String[]{"let", "it", "go"});
        boolean c = wordBreak(a, b);
        System.out.println(c);
    }

}
