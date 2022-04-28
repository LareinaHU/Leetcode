package top100;

import java.util.HashMap;
import java.util.Stack;

public class try1234 {
    public static void main(String[] args) {
        String s = "3421abcd";
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int n = s.length();
        System.out.println(n);
        while (index < n) {
            char c = s.charAt(index);
            System.out.println("c" + c);
            if (Character.isDigit(c)) {
                int count = 0;
                System.out.println(index);
                while (Character.isDigit(c)) {
                    System.out.println(c);
                    count = count * 10 + c - '0';
                    index++;
                    if (index == 10) {
                        System.out.println(index);
                        break;
                    }
                    stack.push(count);
                }
                break;
            }
        }
    }
}



