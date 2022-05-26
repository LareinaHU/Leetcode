package leetcode100repeat1;

public class leecode3 {
    //brute force
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isRepeated(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    private boolean isRepeated(String s, int left, int right) {
        // char[] c = new char[26];
        int[] count = new int[128];
        for (int i = left; i < right; i++) {
            char c = s.charAt(i);
            count[c]++;
            if (count[c] > 1) {
                return false;
            }
        }
        return true;
    }
}
