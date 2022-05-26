package Math;

public class AddDigits258 {
    public static int addDigits(int num) {
        int sum = 0;
        for(int i = 0;i < 32; i++){
            while(num != 0){
                sum = sum + num%10;
                num /= 10;

            }

        }
        if (sum < 10) return sum;
        else return addDigits(sum);
    }

    public static void main(String[] args) {
        int num = 10073;
        int aa = addDigits(num);
        System.out.println(aa);
    }
}
