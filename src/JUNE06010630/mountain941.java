package JUNE06010630;

import java.util.HashSet;
import java.util.PriorityQueue;

public class mountain941 {
    public boolean validMountainArray(int[] arr) {
        int l = arr.length;
        if (l < 3 || arr[1] < arr[0]) return false;
        int max = 0;
        int index = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        for (int i = 0; i < index; i++) {

            if (arr[i] >= arr[i + 1]) return false;

        }

        for (int i = index; i < l - 1; i++) {
            if (arr[i + 1] >= arr[i]) return false;
        }
        return true;
    }

}