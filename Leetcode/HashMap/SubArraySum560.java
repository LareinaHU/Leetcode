package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum560 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int ans = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
            if (map.containsKey(ans - k)) {
                count += map.get(ans - k);
            }
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        int mm = subarraySum(nums, k);
        System.out.println(mm);
    }
}