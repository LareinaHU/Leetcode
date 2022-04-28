package ninechapter9;

public class lintcode594strstr2 {

    public static int BASE = 1000000;

    public static int strStr2(String source, String target) {
        // write your code here
        if (source == null || target == null) return -1;
        int m = target.length();
        if (m == 0) return 0;

        int power = 1;
        for (int i = 0; i < m; i++) {
            power = (power * 31) % BASE;
        }

        //calculate target hashcode
        int targetCode = 0;
        for (int i = 0; i < m; i++) {
            targetCode = (targetCode * 31 + target.charAt(i)) % BASE;
        }

        int hashCode = 0;
        for (int i = 0; i < source.length(); i++) {
            //abc + d
            hashCode = (hashCode * 31 + source.charAt(i) )% BASE;
            if(i < m - 1){
                continue;
            }
            //abcd - a
            if (i > m - 1) {
                hashCode = (hashCode - source.charAt(i - m) * power) % BASE;
                if (hashCode < 0) {
                    hashCode += BASE;
                }
            }

            //double check the string
            if (hashCode == targetCode) {
                if (source.substring(i - m + 1, i + 1).equals(target)) {
                    return i - m + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String source = "abcdef";
        String target = "bcd";
        int k = strStr2(source, target);
        System.out.println(k);

    }

}
