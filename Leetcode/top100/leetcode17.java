package top100;

import java.util.*;

public class leetcode17 {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new LinkedList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("");
        String[] dict = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';
            String str = dict[num];

            while (queue.peek().length() == i) {
                String curr = queue.poll();
                for (char c : str.toCharArray()) {
                    queue.offer(curr + c);
                }
            }
        }
        while (!queue.isEmpty()) {
            ans.add(queue.poll());
        }
        return ans;
    }
}
