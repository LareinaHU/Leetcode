package leetcode100repeat1;

import java.util.HashMap;

public class leetcode3hashmap {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 1;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
              //  System.out.println("left: " + left);
            }
            maxLen = Math.max(maxLen, i - left + 1);
            map.put(s.charAt(i), i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int k = lengthOfLongestSubstring("abcadefb");
        System.out.println(k);
    }
}