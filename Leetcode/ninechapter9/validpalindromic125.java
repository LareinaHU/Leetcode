package ninechapter9;

public class validpalindromic125 {
    public static boolean isPalindrome(String s) {
        int p = 0, q = s.length() - 1;
        while (p < q) {
            while (p < q && !isLetterOrDigit(s.charAt(p))) p++;
            while (p < q && !isLetterOrDigit(s.charAt(q))) q--;
            if (Character.toLowerCase(s.charAt(p)) == Character.toLowerCase(s.charAt(q))) {
                p++;
                q--;
            } else {
                return false;
            }
        }
        return true;
    }


    public static boolean isLetterOrDigit(char i){
        return (i >='A' && i <= 'Z') ||
                (i >='a' && i <= 'z') ||
                (i >='0' && i <= '9') ;
    }

    public static void main(String[] args) {
        String s = "A man, a p, Panama";
        System.out.println(isPalindrome(s));
    }
}
