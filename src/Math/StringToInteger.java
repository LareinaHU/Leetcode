package Math;


public class StringToInteger {

    public static int myAtoi(String str) {
        int sign = 1;
        int index = 0;
        int result = 0;
        if(str.length()==0) return 0;
        while(index < str.length() && str.charAt(index) == ' '){
            index++;
        }
        if(index < str.length() && (str.charAt(index) == '-' || str.charAt(index) == '+')){
            sign = (str.charAt(index++)=='+')?1 : -1;
        }
        while(index<str.length() && str.charAt(index)<='9' && str.charAt(index) >= '0'){
            if(result > Integer.MAX_VALUE/10 ||(result == Integer.MAX_VALUE/10 && (str.charAt(index)-48)>7 ))
            {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            else result = result * 10 + str.charAt(index++) -48;

        }
        return result * sign;
    }

    public static void main(String[] args) {
        String aa = "-1324";

        int c = myAtoi(aa);

        System.out.println(c);

    }

}
