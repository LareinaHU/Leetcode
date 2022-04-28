//package ninechapter9;
//
//public class lintcode891validPalindrome {
////    public boolean validPalindrome(String s) {
////        return validate(s, 0, s.length() - 1, 0, 1);
////    }
////
////    public boolean validate(String s, int i, int j, int delCount, int N) {
////        if (delCount > N) return false; // N - times of deletion allowed.
////        while (i < j) {
////            if (s.charAt(i) == s.charAt(j)) {
////                i++;
////                j--;
////            } else {
////                delCount++;
////                return validate(s, i, j - 1, delCount, N) || validate(s, i + 1, j, delCount, N);
////            }
////        }
////        return true;
////    }
////
////}
//
//