package top100;

import java.util.*;

public class tryfactors {
    public static void main(String[] args) {

        String s = "aaaaaa";
        int[] count = new int[128];
        for (int i = 0; i < 6; i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        System.out.println(Arrays.toString(count));
    }
}
