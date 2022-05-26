package ninechapter9;

public class gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int start = 0;
        int curr = 0;
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            curr += gas[i] - cost[i];
            if (curr < 0) {
                start = i + 1;
                curr = 0;
            }

            total = curr;

        }
        return total >= 0 ? start : -1;
    }
}
