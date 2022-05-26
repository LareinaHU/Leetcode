package top100;


/*
2   3   1   1   4
0   1   2   3   4

max = 0;
//possible farthest position!
max = Math.max(max, nums[i] + i);
if(i > max)  false;
max >= nums.length - 1; true

*/


public class leetcode55 {
    public boolean canJump(int[] a) {
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(i > max){
                return false;
            }
            max = Math.max(max, a[i] + i);
        }
        return max >= a.length - 1;
        // return true;

    }
}