package Leetcode3march;

import java.util.*;

public class setmismatch {
    public int[] findErrorNums(int[] nums) {
        int missing = -1;
        int dup = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                dup = i;
            }
            set.add(i);
        }
        for (int i =1 ; i <= nums.length; i++) {
            if (!set.contains(i)) missing = i;
        }
        return new int[]{dup, missing};
    }
}


//            Map< Integer, Integer > map = new HashMap();
//            int dup = -1, missing = 1;
//            for (int n: nums) {
//                map.put(n, map.getOrDefault(n, 0) + 1);
//            }
//            for (int i = 1; i <= nums.length; i++) {
//                if (map.containsKey(i)) {
//                    if (map.get(i) == 2)
//                        dup = i;
//                } else
//                    missing = i;
//            }
//            return new int[]{dup, missing};
//        }
//    }
