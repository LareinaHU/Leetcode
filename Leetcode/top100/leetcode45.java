package top100;

public class leetcode45 {
    public int jump(int[] nums) {
        int jump = 0;
        int curr_far = 0;
        int farthest = 0;
        for(int i = 0; i < nums.length; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if(i == curr_far){
                jump++;
                curr_far = farthest;
            }
        }
        return jump;
    }
}