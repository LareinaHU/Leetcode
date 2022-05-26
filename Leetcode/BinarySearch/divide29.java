package BinarySearch;



public class divide29 {
    public static  int divide(int dividend, int divisor) {

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long Dividend = (long) Math.abs(dividend);
        long Divisor = (long) Math.abs(divisor);
        long ans = 0;
        while (Dividend >= Divisor) {
            long temp = Divisor;
            long multiply = 1;  //  18 - 3*2*2 -3*2
            System.out.println("temp1111:"  + temp);

            while (Dividend >= (temp <<1)) {
                System.out.println("temp2222:"  + temp);
                //  Dividend -= temp;
                temp <<= 1;
                multiply <<= 1;
            }
            ans += multiply;
            Dividend -= temp;

        }
        ans *= sign;
        if (ans >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) ans;
        }
    }

    public static void main(String[] args) {
        int a = 15, b= 3;
       int k =  divide(a, b);
        System.out.println(k);
    }
}