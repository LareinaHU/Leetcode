package August;

public class query303 {
    int[] arr;

    public query303(int[] nums) {
        arr= new int[nums.length+1];
        int j=1;
        for(int i: nums){
            arr[j]=arr[j-1]+i;
            j++;
        }
    }

    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}
