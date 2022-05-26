package top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode438 {
    public static List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.length() == 0) {
            return new ArrayList<>();
        }
        int sl = s.length();
        int pl = p.length();
        if (sl < pl) return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : p.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }


        for (int i = 0; i < sl; i++) {
            char ch = s.charAt(i);

            map2.put(s.charAt(i), map2.getOrDefault(ch, 0) + 1);

            if (i >= pl) {
                ch = s.charAt(i - pl);
                if (map2.get(ch) == 1) {
                    map2.remove(ch);
                } else {
                    map2.put(ch, map2.get(ch) - 1);
                }
            }
            if (map1.equals(map2)) {
                ans.add(i - pl + 1);
            }

        }
        return ans;

    }
}