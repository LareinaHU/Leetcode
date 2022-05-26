package ninechapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class permulation47 {
    public List<String> stringPermutation2(String str) {
        // write your code here
        List<String> results = new ArrayList<>();
        if(str.isEmpty()){
            results.add("");
            return results;}
        String sortStr = sortString(str);
        dfs(sortStr, "", results, new boolean[str.length()]);
        return results;
    }
    private String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);
        return str;
    }
    private void dfs(String str, String subset, List<String> results, boolean[] isvisited){
        if(subset.length() == str.length()){
            results.add(subset);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            if(isvisited[i]){
                continue;
            }
            if(i > 0 && str.charAt(i) == str.charAt(i - 1) && !isvisited[i - 1]){
                continue;
            }
            isvisited[i] = true;
            dfs(str, subset + str.charAt(i), results, isvisited);
            isvisited[i] = false;
        }
    }
}