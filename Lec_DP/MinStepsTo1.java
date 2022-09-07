package Lec_DP;

public class MinStepsTo1 {

	public int sovleTD(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}
		if (dp[n] != 0) {
			return dp[n];
		}
		if (n % 2 == 0) {
			int curr = 1 + sovleTD(n / 2, dp);
			dp[n] = curr;

			return curr;
		} else {
			int sp1 = 1 + sovleTD(n + 1, dp);
			int sp2 = 1 + sovleTD(n - 1, dp);
			dp[n] = Math.min(sp2, sp1);

			return Math.min(sp2, sp1);
		}
	}

	public static int solveBU(int num) {
		int[] dp = new int[num + 1];

		for (int n = 2; n <= num; n++) {
//			dp[n]
			if (n % 2 == 0) {
				int curr = 1 + dp[n / 2];
				dp[n] = curr;

			} else {
				int sp1 = 1 + dp[(n + 1) / 2] + 1;
				int sp2 = 1 + dp[n - 1];
				dp[n] = Math.min(sp2, sp1);
			}
		}
		return dp[num];
	}
}
