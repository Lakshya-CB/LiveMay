package Lec_DP;

public class ClimbStairs {
//https://leetcode.com/problems/climbing-stairs/

	public int climb(int n, Integer[] dp) {
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = climb(n - 1, dp);
		int sp2 = climb(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}

	public int climbBU(int Nth) {
		int[] dp = new int[Nth + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int n = 2; n <= Nth; n++) {
//			dp[n]
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[Nth];
	}

}
