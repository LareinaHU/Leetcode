package BinarySearch;

public class FirstOccurance2 {
    public static int BS(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        while (l < r){
            int mid = l + (r - l)/2;
            if(arr[mid] < k) {
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {12,21,22,22,22,22,34,35,36};
        int qq = BS(a, 22);
        System.out.println(qq);
    }
}
