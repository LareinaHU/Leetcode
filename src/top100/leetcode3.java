package top100;

import java.util.HashMap;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int MaxLen = 1;
        int n = s.length();
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            MaxLen = Math.max(MaxLen, i - left + 1);
            map.put(s.charAt(i), i);
        }

        return MaxLen;
    }
}