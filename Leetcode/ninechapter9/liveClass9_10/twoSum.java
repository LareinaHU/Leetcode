package ninechapter9.liveClass9_10;

import java.util.ArrayList;
import java.util.List;

//Data Structure
public class twoSum {
    public List<Integer> nums;

    public twoSum() {
        nums = new ArrayList<Integer>();
    }

    public void add(int number) {
        // write your code here
        nums.add(number);
        int index = nums.size() - 1;
        while (index > 0 && nums.get(index - 1) > nums.get(index)) {
            swap(nums, index);
            index--;
        }
    }

    private void swap(List<Integer> nums, int index) {
        int temp = nums.get(index);
        nums.set(index, nums.get(index - 1));
        nums.set(index, temp);
    }


    public boolean find(int value) {
        // write your code here
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            int twoSum = nums.get(left) + nums.get(right);
            if (twoSum < value) left++;
            else if (twoSum > value) right--;
            else {
                return true;
            }
        }
        return false;
    }
}
