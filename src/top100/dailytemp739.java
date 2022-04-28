package top100;

import java.util.Stack;

public class dailytemp739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] result = new int[l];


        for (int i = 0; i < l; i++) {
            int count = 0;
            for (int j = i + 1; j < l; j++) {

                if (temperatures[i] >= temperatures[j]) {
                    count++;
                }else {
                    result[i] = ++count;
                    break;
                }
            }
        }
        return result;

    }
}
