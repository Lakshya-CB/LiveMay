package Lec_36_37_DP;

public class EditDist {
	public static void main(String[] args) {
		System.out.println(solve("horse", "ros", 0, 0));
	}

	public static int solve(String str1, String str2, int idx1, int idx2, Integer[][] dp) {
//		if(idx1==str1.length() && idx2==str2.length()) {
//			return 0;
//		}
		if (idx1 == str1.length() || idx2 == str2.length()) {
			int S1 = str1.length() - idx1;
			int S2 = str2.length() - idx2;
			return Math.max(S1, S2);
		}
		if (dp[idx1][idx2] != null) {
			return dp[idx1][idx2];
		}

		if (str1.charAt(idx1) == str2.charAt(idx2)) {
			dp[idx1][idx2] = solve(str1, str2, idx1 + 1, idx2 + 1, dp);
			return dp[idx1][idx2];
		} else {
			int In = solve(str1, str2, idx1, idx2 + 1, dp);
			int Del = solve(str1, str2, idx1 + 1, idx2, dp);
			int Rep = solve(str1, str2, idx1 + 1, idx2 + 1, dp);
			dp[idx1][idx2] = Math.min(Del, Math.min(In, Rep)) + 1;
			return Math.min(Del, Math.min(In, Rep)) + 1;
		}
	}

	public static int BU(String str1, String str2) {
		int[][] dp = new int[str1.length()][str2.length()];

		for (int idx1 = str1.length(); idx1 >= 0; idx1--) {
			for (int idx2 = str2.length(); idx2 >= 0; idx2--) {
//				dp[idx1][idx2]

				if (idx1 == str1.length() || idx2 == str2.length()) {
					int S1 = str1.length() - idx1;
					int S2 = str2.length() - idx2;
					dp[idx1][idx2] = Math.max(S1, S2);
				}
				if (str1.charAt(idx1) == str2.charAt(idx2)) {
					dp[idx1][idx2] = dp[idx1 + 1][idx2 + 1];
				} else {
					int In = dp[idx1][idx2 + 1];
					int Del = dp[idx1 + 1][idx2];
					int Rep = dp[idx1 + 1][idx2 + 1];
					dp[idx1][idx2] = Math.min(Del, Math.min(In, Rep)) + 1;

				}
			}
		}
		return dp[0][0];
	}

}
