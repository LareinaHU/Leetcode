package top100;

public class leetcode283 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }else{
                continue;
            }
        }
        while(j < nums.length){
            nums[j++] = 0;
        }
    }
}
