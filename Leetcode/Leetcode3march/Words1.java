package Leetcode3march;

import java.util.HashMap;
import java.util.Map;

public class Words1 {
    public static int calculateTime(String keyboard, String word) {
        //   keyboard = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            map.put(keyboard.charAt(i), i);
        }
        int ans = map.get(word.charAt(0));
        for (int i = 1; i < word.length(); i++) {
           ans += Math.abs(map.get(word.charAt(i))-map.get(word.charAt(i-1)));
        }
        return ans;
    }

    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        int cc = calculateTime("abcdef","aac");
        System.out.println(cc);

    }
}
