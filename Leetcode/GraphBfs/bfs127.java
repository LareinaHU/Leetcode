package GraphBfs;

import java.util.*;

public class bfs127 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        if(!set.contains(endWord)) return 0;
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                for (int j = 0; j < curr.length(); j++) {
                    char[] arr = curr.toCharArray();
                    for (char x = 'a'; x <= 'z'; x++) {
                        arr[j] = x;
                        String temp = new String(arr);
                        if (set.contains(temp)) {
                           if (temp.equals(endWord)) return level + 1;
                            queue.offer(temp);
                            set.remove(temp);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
//        String beginWord = "abc";
//        String endWord = "fff";
//        List<String> wordList = Arrays.asList("abd","abb","cff","fcf","afd","ffd","fff");
        String beginWord = "ymain";
        String endWord = "oecij";
        List<String> wordList = Arrays.asList("ymann", "yycrj", "oecij", "ymcnj", "yzcrj", "yycij", "xecij",
                "yecij", "ymanj", "yzcnj", "ymain");
        int n = ladderLength(beginWord, endWord, wordList);
        System.out.println(n);
    }
}
