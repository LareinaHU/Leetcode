package Leetcode3march;

public class Palindromic {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        for (int left = 0, right = s.length() - 1; left <= right; left++, right--) {
            if(s.charAt(left)!=s.charAt(right)){
                return 2;
            }
        }
        return 1;

    }
}
