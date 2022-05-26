package ninechapter9;

public class longestpalindromic {
    public static String longestPalindrome(String s) {

        int n = s.length();
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        int MaxLen = 0;
        for (int i = 1; i < n; i++) {
            int len1 = ExtendByCenter(s, i, i);
            int len2 = ExtendByCenter(s, i - 1, i);
            if (len1 > MaxLen) {
                start = i - len1 / 2;
                end = start + len1 - 1;
                MaxLen = len1;
            }
            if (len2 > MaxLen) {
                start = i - len2 / 2;
                end = i - 1 + len2 / 2;
                MaxLen = len2;
            }
        }
        return s.substring(start, end + 1);
    }



        private static int ExtendByCenter(String s, int left, int right){
            int L = left;
            int R = right;
            int MaxLen = 0;
            while(L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)){
                MaxLen = R - L + 1;
                L--;
                R++;
            }
            return MaxLen;
        }
    }

