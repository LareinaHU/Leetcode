package top100;

import java.util.*;

public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
        String temp = sortedString(str);
        if (!map.containsKey(temp)) {
            map.put(temp, new ArrayList<>());
        }
        map.get(temp).add(str);
    }
    List<List<String>> ans = new ArrayList<>();

        for(List<String> temp1: map.values()){
        ans.add(temp1);
    }
        return ans;
}

    private String sortedString(String strs) {
        char[] charArr = strs.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}