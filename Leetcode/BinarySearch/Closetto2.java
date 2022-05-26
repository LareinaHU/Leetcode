package BinarySearch;

public class Closetto2 {
    private static int CC(int[] a, int k) {
        int r = a.length - 1;
        int l = 0;
        int bb = 0;
        while (l < r - 1) {
            int mid = l + (r - l) / 2;
            if (a[mid] >= k) r = mid;
            else l = mid;
        }
        if (k < a[l]) return l;
        else if(k > a[r]) return r;
        else return bb = ((a[r] - k) > (k - a[l])) ? a[l] : a[r];
    }
    public static void main(String[] args) {
        int[] a = {12,21,22,22};
        int qq = CC(a, 23);
        System.out.println(qq);
    }
}
