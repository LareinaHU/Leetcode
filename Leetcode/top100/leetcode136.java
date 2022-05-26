package top100;

public class leetcode136 {
    public int unique(int[] nums){
        int a = 0;
        for(int i: nums){
            a ^= i;
        }
        return a;
    }
}
