package ninechapter9;

import java.util.*;

public class leetcode127wordladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        dict.add(endWord);
        HashMap<String, Integer> distance = new HashMap<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add(beginWord);
        distance.put(beginWord, 1);
        while (!queue.isEmpty()) {
            String curWord = queue.poll();
            if (curWord.equals(endWord)) {
                return distance.get(curWord);
            }
            for (String nextWord : nextWords(curWord, dict)) {
                if (distance.containsKey(nextWord)) {
                    continue;
                }
                queue.offer(nextWord);
                distance.put(nextWord, distance.get(curWord) + 1);
            }
        }
        return 0;
    }

    private List<String> nextWords(String word, Set<String> wordList) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            String p1 = word.substring(0, i);
            String p2 = word.substring(i + 1);
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String ss = p1 + ch + p2;

                if (ss.equals(word)) {
                    continue;
                }
                if (wordList.contains(ss)) {
                    list.add(ss);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("hit");
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("cog");
        leetcode127wordladder aa = new leetcode127wordladder();
        int k = aa.ladderLength("hit", "cog", wordList);
        System.out.println(k);


    }

}