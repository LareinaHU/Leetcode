package Heap;

import java.util.*;

public class TopK692 {
    public static List<String> topKFrequent(String[] words, int k) {

            HashMap<String, Integer> frequency = new HashMap<>();
            List<String> result = new ArrayList<>();
            //store frequency of each word
            for(int i=0; i<words.length; i++){
                frequency.put(words[i], frequency.getOrDefault(words[i], 0)+1);
            }
            PriorityQueue<String> heap = new PriorityQueue<>(new Comparator<String>(){
                @Override
                public int compare(String w1, String w2){
                    int f1 = frequency.get(w1);
                    int f2 = frequency.get(w2);
                    if(f1==f2) return w2.compareTo(w1);
                    return f1-f2;
                }
            }
            );
            for(String word: frequency.keySet()){
                heap.add(word);
                if(heap.size()>k) heap.poll();
            }
            while(heap.size()>0){
                result.add(heap.poll());
            }
   //?????         Collections.reverse(result);
            return result;
        }

    public static void main(String[] args) {
        String[] ww = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> www = topKFrequent(ww,5);
        System.out.println(www);
    }
}
