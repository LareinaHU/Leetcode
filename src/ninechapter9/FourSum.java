package ninechapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        // 异常处理
        if (numbers.length < 4) {
            return res;
        }
        // 排序
        Arrays.sort(numbers);

        // 固定最小值
        for (int i = 0; i < numbers.length - 3; i++) {
            // 外层循环的去重
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < numbers.length - 2; j++) {
                // 外层循环的去重
                if (j > i + 1 && numbers[j] == numbers[j - 1]) {
                    continue;
                }
                int value = target - numbers[i] - numbers[j];
                twoSum(numbers, j + 1, numbers.length - 1, value, i, j, res);
            }
        }
        return res;
    }

    private void twoSum(int[] numbers, int start, int end, int value, int i, int j, List<List<Integer>> res) {
        int left = start, right = end;
        while (left < right) {
            List<Integer> r = new ArrayList<>();
            if (numbers[left] + numbers[right] == value) {
                r.add(numbers[i]);
                r.add(numbers[j]);
                r.add(numbers[left]);
                r.add(numbers[right]);
                res.add(r);

                left++;
                right--;

                // 去重处理
                while (left < right && numbers[left] == numbers[left - 1]) {
                    left++;
                }
                while (left < right && numbers[right] == numbers[right + 1]) {
                    right--;
                }
            }

            if (numbers[left] + numbers[right] > value) {
                right--;
            }
            if (numbers[left] + numbers[right] < value) {
                left++;
            }
        }
    }
}