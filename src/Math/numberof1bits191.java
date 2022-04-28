package Math;

public class numberof1bits191 {
    public static int hammingWeight(int n) {
        int ans = 0;
        while (n != 0){
            n = n & (n-1);
            ans ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = 4234;

        int result = hammingWeight(a);

        System.out.println(result);
    }
}
