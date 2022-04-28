package Math;

public class MissingNumbers268 {
//    public static int missingNumber(int[] nums) {
//        int t = nums.length;
//        int total = (1 + t) * t / 2;
//        int numsTr = 0;
//        for (int i = 0; i < t; i++) {
//            numsTr += nums[i];
//        }
//
//        return (total - numsTr);
//    }


    public static int missingNumber(int[] nums) {
        int missing = 0;
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = i;
            missing ^= b[i] ^ nums[i];
        }
        missing = missing ^ nums.length;
        return missing;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 0, 9};
        int mm = missingNumber(a);
        System.out.println(mm);
    }
}
