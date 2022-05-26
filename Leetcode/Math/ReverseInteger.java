package Math;

public class ReverseInteger {
    //    Assume we are dealing with an environment that could only store integers within the 32-bit
    //    signed integer range: [−231,  231 − 1]. For the purpose of this problem,
    //    assume that your function returns 0 when the reversed integer overflows.

    //-----------cheating way1
//    public int reverse(int x) {
//        long answer = 0;
//        while (x != 0) {
//            answer = answer * 10 + x % 10;
//            x = x / 10;
//        }
//        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) answer = 0;
//        int ans = (int) answer;
//        return ans;
//    }

    //way2
    public int reverse(int x) {
        int answer = 0;

        while (x != 0) {
            int pop = x % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && pop > 7)) {
                answer = 0;
                break;
            }
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && pop < -8)) {
                answer = 0;
                break;
            }
            answer = answer * 10 + pop;
            x = x / 10;
        }
        return answer;
    }


    public static void main(String[] args) {
        ReverseInteger HH = new ReverseInteger();
        int aa = -2147483412;
        int answer = HH.reverse(aa);
        //   System.out.println(Integer.MAX_VALUE);
        System.out.println(aa);
        System.out.println(answer);
    }
}
