package Leetcode3march;

import java.util.HashSet;

public class hasAllCodeB {
    public static boolean hasAllCodes(String s, int k) {
        if (k >= s.length()) return false;
        HashSet<String> hh = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {


            hh.add(s.substring(i, k + i));
            System.out.println(hh);

        }

        System.out.println(hh.size());

        return hh.size() >= Math.pow(2, k) ? true : false;

    }

    public static void main(String[] args) {
        String ss = "00110";
        int k = 2;
        boolean aa = hasAllCodes(ss, k);
        System.out.println(aa);

    }
}