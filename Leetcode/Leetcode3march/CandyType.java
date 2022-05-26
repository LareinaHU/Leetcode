package Leetcode3march;

//import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLService;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CandyType {
    public static int distributeCandies(int[] candyType) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < candyType.length; i++) {
            map.put(candyType[i], i);
        }
        System.out.println(map.size());
        if (map.size() >= candyType.length / 2) return candyType.length / 2;
        else return map.size();

    }

    public static void main(String[] args) {
        int[] aa = {1, 1, 2, 2, 3, 3};
        int cc = distributeCandies(aa);
        System.out.println(cc);
    }
}
