package top100;

public class reverse {
    public String str(String input){
        String s = "";
        for(int i = input.length() - 1; i >= 0 ; i--){
            s += input.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        String s1 = "fadsfasd";
        reverse Re = new reverse();
        String s2 = Re.str(s1);
        System.out.println(s2);

    }
}
