package top100;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        dfs(ans, "", n, 0, 0);
        return ans;
    }

    private static void dfs(List<String> ans, String path , int n, int open, int close){
        if(open > n || close > open) {return;}
        if(path.length() == n * 2){
           ans.add(path);
           return;
        }
        dfs(ans, path + "(", n, open + 1, close);
        dfs(ans, path + ")", n, open, close + 1);
    }

    public static void main(String[] args) {
        List<String> s = generateParenthesis(2);
        System.out.println(s);
    }
}
