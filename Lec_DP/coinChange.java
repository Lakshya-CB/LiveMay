package Lec_36_37_DP;

public class coinChange {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3 };
		int A = 4;
		System.out.println(solve(coins, A, 0));
	}

	public static int solve(int[] coins, int A, int idx) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length || A < 0) {
			return 0;
		}
		int sp1 = solve(coins, A - coins[idx], idx);
		int sp2 = solve(coins, A, idx + 1);
		return sp1 + sp2;
	}

	public static int solveTD(int[] coins, int A, int idx, Integer[][] dp) {
		if (A == 0) {
			return 1;
		}
		if (idx == coins.length || A < 0) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = solveTD(coins, A - coins[idx], idx, dp);
		int sp2 = solveTD(coins, A, idx + 1, dp);
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public static int BU(int[] coins, int Amount) {
		int[][] dp = new int[Amount+1][coins.length+1];
		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
//				dp[A][idx]!!
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
//					break;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[Amount][0];
	}
}
