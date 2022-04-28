package Math;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            ans = (ans << 1) | (n & 1);
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 0b1111100001101;
        System.out.println(Integer.toBinaryString(n));
        ReverseBits rr = new ReverseBits();
        int m = rr.reverseBits(n);
        System.out.println(Integer.toBinaryString(m));
    }
}
