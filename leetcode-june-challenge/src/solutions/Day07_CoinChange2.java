package solutions;

public class Day07_CoinChange2 {

	public static int change(int amount, int[] coins) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		dp[0][0] = 1;

		for (int i = 1; i <= coins.length; i++) {
			dp[i][0] = 1;
			for (int j = 1; j <= amount; j++) {
				dp[i][j] = dp[i - 1][j] + (j >= coins[i - 1] ? dp[i][j - coins[i - 1]] : 0);
			}
		}
		return dp[coins.length][amount];
	}

	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 5;
		System.out.println(change(amount, coins));
	}

}
