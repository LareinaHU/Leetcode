package ninechapter9.liveClass9_10;

import java.util.HashMap;
import java.util.Map;

public class TwoSumT {
    private Map<Integer, Integer> map;

    public TwoSumT(){
        map = new HashMap<>();
    }
    public void add(int number) {
        // write your code here
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        // write your code here
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int num1 = entry.getKey();
            int comp = value - num1;
            if((num1 == comp) && entry.getValue() > 1 || (num1 != comp) && map.containsKey(comp)){
                return true;
            }
        }
        return false;
    }
}

