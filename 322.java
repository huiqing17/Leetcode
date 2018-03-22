class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE) return -1;
        else return dp[amount];
    }
}
