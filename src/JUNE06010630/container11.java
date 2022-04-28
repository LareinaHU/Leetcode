package JUNE06010630;

public class container11 {
    public static int maxArea(int[] height) {
        if (height.length <= 1) return 0;
        int q = height.length - 1;
        int p = 0;
        int max = 0;
        while (p < q) {
            int ss = (q - p) * (Math.min(height[p], height[q]));
            max = Math.max(max, ss);
            if (height[p] <= height[q]) {
                p++;
            } else {
                q--;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] a = {11, 2, 34, 35, 46, 8};
        int k = maxArea(a);
        System.out.println(k);
    }
}
