package BinarySearch;

public class peek852 {
    public int peakIndexInMountainArray(int[] arr) {
        int length = arr.length;
        int start = 0, end = length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= arr[mid + 1]) {
                start = mid;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }
}
