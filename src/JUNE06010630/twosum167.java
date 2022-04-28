package JUNE06010630;

import java.util.Arrays;
import java.util.HashMap;

public class twosum167 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int val = map.get(target - numbers[i]);
                if (val != i) {
                    return new int[]{i, val};
                }
            }
            else{
                map.put(numbers[i], map.getOrDefault(numbers[i],i));
            }
        }

            return null;
        }

        public static void main (String[]args){
            int[] a = {12, 3432, 54, 354};
            int target = 66;
            int[] k = twoSum(a, target);
            System.out.println(Arrays.toString(k));
        }
    }
