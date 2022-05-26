package top100;

public class leetcode5 {
    int maxLen = 0, left = 0;

    public String longestPalindrome(String s) {
        int maxLen = 0;
        if (s == null || s.length() == 0) {
            return s;
        }
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i);
            helper(s, i, i + 1);
        }
        return s.substring(left, left + maxLen);
    }

    private void helper(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            if (r - l + 1 > maxLen) {
                left = l;
                maxLen = r - l + 1;
            }
            l--;
            r++;
        }
    }
}
