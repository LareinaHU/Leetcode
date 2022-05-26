package TwoPointers;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i <= j) {
            exchange(s, i, j);
            i++;
            j--;

        }

    }
    public static void exchange(char[] a, int aa, int bb) {
        char cc = a[aa];
        a[aa] = a[bb];
        a[bb] = cc;
    }

    public static void main(String[] args) {
        char[] ss = {'h', 'e', 'l', 'l', 'o'};
        reverseString(ss);
        System.out.println(ss);
    }
}
