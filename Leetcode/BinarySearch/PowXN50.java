package BinarySearch;

public class PowXN50 {
    public static double myPow(double x, int n) {
        int sign = 1;
        if (x < 0 && (n % 2 == 1 || n % 2 == -1)) {
            sign = -1;
        }
        x = Math.abs(x);
        return sign * Math.exp(Math.log(x) * n);
    }

    public static void main(String[] args) {
        double a = myPow(-5, -1);
        System.out.println(a);
    }
}
