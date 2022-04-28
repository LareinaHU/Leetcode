package ninechapter9;

import java.util.Arrays;

public class merge123456 {
    public static int[] merge(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] >= b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
            }

        }
        if (i >= a.length) {
            c[k++] = b[j++];
        }
        if (j >= b.length) {
            c[k++] = a[i++];
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {2, 13324, 3};
        int[] b = {767};
        int[] c = merge(a, b);
        System.out.println(Arrays.toString(c));
    }
}
