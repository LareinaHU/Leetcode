package Leetcode3march;


import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic {
    public static boolean isStrobogrammatic(String num) {

        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        for (int left = 0, right = num.length() - 1; left <= right; left++, right--) {
            if (!map.containsKey(num.charAt(right))||num.charAt(left) != map.get(num.charAt(right))) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        String kk = "69";
        boolean aa = isStrobogrammatic(kk);
        System.out.println(aa);


    }
}

//    StringBuilder ss = new StringBuilder();
//    Map<Character, Character> map = new HashMap<>();
//        map.put('0', '0');
//                map.put('1', '1');
//                map.put('6', '9');
//                map.put('8', '8');
//                map.put('9', '6');
//                for (int i = num.length() - 1; i >= 0; i--) {
//                if (!map.containsKey(num.charAt(i))) {
//                return false;
//                }
//                ss.append(map.get(num.charAt(i)));
//                }
//                String ss1 = ss.toString();
//                //  System.out.println(ss);
//                if (num.equals(ss1)) return true;
//                else return false;
//                }

//
//
//    public boolean isStrobogrammatic(String num) {
//        StringBuilder str = new StringBuilder(num);
//        for (int i = 0; i < num.length(); i++) {
//            int k = (int) (num.charAt(i) - 48);
//            if (k == 2 || k == 3 || k == 4 || k == 5 || k == 7) {
//                return false;
//            }
//
//            if (num.charAt(i) == '6') {
//                str.setCharAt(i, '9');
//            } else if (num.charAt(i) == '9') {
//                str.setCharAt(i, '6');
//            } else {
//                str.setCharAt(i, num.charAt(i));
//            }
//        }
//        System.out.println(str);
//        for (int i = 0; i < num.length(); i++) {
//
//            if (str.charAt(num.length() - 1 - i) == num.charAt(i)) {
//                continue;
//            } else return false;
//        }
//        return true;
//        //   throw new IllegalArgumentException();
//    }
//}