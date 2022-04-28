package top100;

public class leetcode875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;

        int right = 1;
        for (int i : piles) {
            right = Math.min(right, i);
        }

        while (left + 1< right) {
            int middle = left + (right - left) / 2;
            int hourSpent = 0;

            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }
            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }
}