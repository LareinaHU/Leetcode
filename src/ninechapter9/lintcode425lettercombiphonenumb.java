package ninechapter9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lintcode425lettercombiphonenumb {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("");
        String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i = 0; i < digits.length(); i++){
            int num = digits.charAt(i) - '0';
            String str = dict[num];
            while(queue.peek().length() == i){
                String curr = queue.poll();
                for(char c : str.toCharArray()){
                    queue.offer(curr + String.valueOf(c));
                }
            }
        }
        return queue;
    }
}