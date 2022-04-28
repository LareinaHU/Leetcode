package ninechapter9;

import java.util.*;

public class wordladderlintcode120 {
    public int ladderlength(String start, String end, Set<String> dict) {
        dict.add(end);
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(start);
        Map<String, Integer> distance = new HashMap<>();
        distance.put(start, 1);
        while (!queue.isEmpty()) {
            String word = queue.poll();
            if (word.equals(end)) {
                return distance.get(word);
            }
            for (String nextword : getNextWords(word, dict)) {
                if (distance.containsKey(nextword)) {
                    continue;
                }
                queue.offer(nextword);
                distance.put(nextword, distance.get(word) + 1);
            }
        }
        return 0;
    }

    private List<String> getNextWords(String word, Set<String> dict) {
        List<String> words = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            String left = word.substring(0, i);
            String right = word.substring(i + 1);
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (word.charAt(i) == ch) {
                    continue;
                }
                String nextWord = left + ch + right;
                if (dict.contains(nextWord)) {
                    words.add(nextWord);
                }
            }
        }
        return words;
    }
}
