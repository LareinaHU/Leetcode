package HashMap;

import java.util.HashMap;

public class hashmaptry {
    public static void main(String[] args) {
        HashMap<Integer,Integer> HH = new HashMap<>();
        HH.put(100,1);
        HH.put(200,2);
        HH.put(300,3);
        HH.put(400,4);
        if(HH.containsKey(400)){
            System.out.println(HH.get(400));
            System.out.println();
        }
    }
}
