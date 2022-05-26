package ninechapter9;

import java.util.*;

public class threeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
            if (nums.length < 4) return null;
            //    if(nums[0] == nums[1])

            Arrays.sort(nums);
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            if(nums[0] == nums[3] && nums[3] == 0) {
                List<Integer> aa = new ArrayList<>();
                aa.add(0);
                aa.add(0);
                aa.add(0);
                aa.add(0);
               list.add(aa);
                return list;
            }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 0);
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {

                if (map.containsKey(nums[i] * (-1) + nums[j] * (-1)) && map.get(nums[i] * (-1) + nums[j] * (-1)) > 1) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[j]);
                    ll.add(nums[i] * (-1) + nums[j] * (-1));
                    list.add(ll);
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
    }
}
