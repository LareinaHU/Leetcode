package ninechapter9;

public class strstr28 {
    private static final Integer BASE = 100007;

    public int strStr2(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        int m = target.length();
        if (m == 0) {
            return 0;
        }

        int power = 1;
        for (int i = 0; i < m; i++) {
            power = (power * 31) % BASE;

        }

        //先计算一下target的hash值

        int targetCode = 0;

        for (int i = 0; i < m; i++) {

            targetCode = (targetCode * 31 + target.charAt(i)) % BASE;

        }

        //当source code 加上右边一个character，就要减掉左边的一个character

        int sourceCode = 0;

        for (int i = 0; i < source.length(); i++) {

            sourceCode = (sourceCode * 31 + source.charAt(i)) % BASE;

            if (i <= m - 1) {

                continue;

            }


            sourceCode = (sourceCode - power * source.charAt(i - m)) % BASE;

            if (sourceCode < 0) {

                sourceCode += BASE;

            }

            //若hash值相同，返回答案

            if (sourceCode == targetCode) {

                return i - m + 1;

            }

        }

        return -1;

    }

    public static void main(String[] args) {
        String source = "abcdef";
        String target = "bcd";
        strstr28 aa = new strstr28();
        int k = aa.strStr2(source, target);
        System.out.println(k);
    }
}

