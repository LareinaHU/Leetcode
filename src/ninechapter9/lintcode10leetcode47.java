package ninechapter9;

import java.lang.reflect.Array;
import java.util.*;

public class lintcode10leetcode47 {
    public static List<String> stringPermutation2(String str) {
        // write your code here
        List<String> results = new ArrayList<>();
        if (str.isEmpty()) return results;
        String sortstr = sortString(str);
        System.out.println("sort: " + sortstr);
        dfs(sortstr, "", results, new boolean[str.length()]);
        System.out.println("resutls000000:  " + results);
        return results;
    }

    private static void dfs(String str, String subset, List<String> results, boolean[] isvisited) {
        System.out.println("1111sub: " + subset);
        if (subset.length() == str.length()) {
            results.add(new String(subset));
            System.out.println("1111res: " + results);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (isvisited[i]) {
                continue;
            }
            if (i > 0 && str.charAt(i) == str.charAt(i - 1) && isvisited[i - 1]) {
                continue;
            }
            subset += str.charAt(i);
            isvisited[i] = true;
            dfs(str, subset, results, isvisited);
            isvisited[i] = false;
        }
    }

    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);
        return str;

    }

    public static void main(String[] args) {
        String str = "add";
        stringPermutation2(str);
    }


}