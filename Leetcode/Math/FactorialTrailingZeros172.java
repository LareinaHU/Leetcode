package Math;

public class FactorialTrailingZeros172 {
//    public int factorial(int n) {
//        if (n == 0) return 1;
//        return n * factorial(n - 1);
//    }

    public int trailingZeroes(int n) {
      int sum = 0;
      while(n > 4){
          sum = sum + n/5;
          n = n/5;
      }
      return sum;
    }

    public static void main(String[] args) {
        FactorialTrailingZeros172 FF = new FactorialTrailingZeros172();
        int n = 13;
        int c = FF.trailingZeroes(n);
        System.out.println(c);
    }
}
