package JUNE06010630;

import java.util.*;

public class hashh {
    public static void main(String[] args) {
        int[][] a = {{435, 354, 6, 5767}, {12, 3, 24, 35, 4}, {45436, 45, 654, 6}};
        Arrays.sort(a, (aa, bb) -> (aa[0] - bb[0]));
        for (int[] i : a) {
            System.out.println(Arrays.toString(i));
        }
    }
}