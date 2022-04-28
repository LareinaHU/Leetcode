package ArrayList;

import java.util.*;

public class ArrayListCo {
    public static void main(String[] args) {
        Random RR = new Random(10);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10;i++){
            set.add(RR.nextInt(10));
        }
        System.out.println(set);
    }
}
