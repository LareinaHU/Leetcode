package Leetcode3march;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] a = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] b = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder SB = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            if (num >= a[i]) {
                int k = num / a[i];
                for (int ii = 0; ii < k; ii++) {
                    SB.append(b[i]);
                }
                num = num - a[i] * k;
            }

        }
        String res = SB.toString();
        return res;

    }

    public static void main(String[] args) {
        int a = 58;
        String ss = intToRoman(a);
        System.out.println(ss);
    }
}
