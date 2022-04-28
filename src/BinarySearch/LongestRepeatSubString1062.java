package BinarySearch;

import java.util.HashSet;
import java.util.Set;

public class LongestRepeatSubString1062 {
    public static int longestRepeatingSubstring(String S) {
        int l = 0, r = S.length() - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (f(S, mid)) {
                l = mid;
            } else {
                r = mid + 1;
            }
        }
        return l;
    }

    public static boolean f(String S, int length) {
        Set<String> seen = new HashSet<>();
        for(int i = 0;i < S.length()-length;i++){
            int j = i + length - 1;
            String sub = S.substring(i, j +1);
            if(seen.contains(sub)){
                return true;}

            seen.add(sub);
            }
        return false;
    }

    public static void main(String[] args) {
        String s = "erfgffadfadfgfhgvzvdafffadffad";
        int n = longestRepeatingSubstring(s);
        System.out.println(n);
    }
}
