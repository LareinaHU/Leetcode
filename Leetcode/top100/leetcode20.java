package top100;

import java.util.Stack;

public class leetcode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if(s.charAt(i) == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.pop() != s.charAt(i)){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}