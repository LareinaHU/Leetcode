package BinarySearch;

public class LastOccurance2 {
    public static int BS(int[] a, int k) {
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            // this is very important!!!mid should't at left, then the program wouldn't stop
            if (a[mid] > k) {
                r = mid - 1;
            } else l = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {12, 21, 22, 22, 22, 22, 34, 35, 36};
        int qq = BS(a, 22);
        System.out.println(qq);
    }
}
