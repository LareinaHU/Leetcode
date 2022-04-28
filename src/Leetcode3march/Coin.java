package Leetcode3march;

import java.util.Arrays;

public class Coin {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i < coin) continue;
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }}
            return dp[amount] == (amount + 1) ? -1 : dp[amount];

        }
        public static void main (String[]args){
            int a = coinChange(new int[]{186, 419, 83, 408}, 6249);
            System.out.println(a);
        }
    }
