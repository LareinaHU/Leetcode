package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class try0209 {
    public static void main(String[] args) {
        int[] a = {5, 4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                exchange(a[i], a[j]);
                System.out.println(a[i]);
                System.out.println(a[j]);
            }
        }
        System.out.println(Arrays.toString(a));


    }

    public static void exchange(int x, int y) {
        int temp;
        if (x > y) {
            temp = y;
            y = x;
            x = temp;
        }
    }

}



