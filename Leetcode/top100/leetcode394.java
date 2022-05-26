package top100;

import java.util.*;

public class leetcode394 {
    public String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<String> strings = new Stack<>();
        String res = "";
        int n = s.length();
        int index = 0;
        while (index < n) {
            char c = s.charAt(index);
            int count = 0;
            if (Character.isDigit(c)) {
                while(Character.isDigit(c)){
                    count = count * 10 + c - '0';
                    index++;
                }
            } else if (c == '[') {
                counts.push(count);
                index++;

            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(strings.pop());
                int k = counts.pop();
                for(int i = 0; i <= k; i++){
                    temp.append(res);
                }
                strings.push(String.valueOf(temp));
                res = "";

            } else {
                res += c;
                index++;
            }
        }
        return strings.pop();
    }
}