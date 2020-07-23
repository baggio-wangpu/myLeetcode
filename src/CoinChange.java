public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        int n = coins.length;

        f[0] = 0;
        for(int i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++) {
                if(i >= coins[j] && f[i - coins[j]] != Integer.MAX_VALUE)
                f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
            }
        }
        if(f[amount] == Integer.MAX_VALUE) return -1;
        return f[amount];
    }
}
