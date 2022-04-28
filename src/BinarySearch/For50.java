package BinarySearch;

public class For50 {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double A = myPow(x, n / 2);
        if (n % 2 == 0) {
            return A * A;
        } else {
            return A * A * x;

        }

    }

    public static void main(String[] args) {
        double cc = myPow(5, -2);
        System.out.println(cc);
    }
}
