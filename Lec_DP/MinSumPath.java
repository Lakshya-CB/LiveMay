package Lec_36_37_DP;

public class MinSumPath {
//	https://leetcode.com/problems/minimum-path-sum/
	public static int solve(int[][] mat, int r, int c) {
		if (r == mat.length || c == mat[0].length) {
//			-ve BC
			return 20000;// an answer which can never exist
		}
		if (r == mat.length - 1 && c == mat[0].length - 1) {
			return mat[r][c];
		}
		int sp1 = mat[r][c] + solve(mat, r, c + 1);// Right
		int sp2 = mat[r][c] + solve(mat, r + 1, c);// Down
		return Math.min(sp1, sp2);

	}

	public static int solveTD(int[][] mat, int r, int c, int[][] dp) {
		if (r == mat.length || c == mat[0].length) {
//			-ve BC
			return 20000;// an answer which can never exist
		}
		if (r == mat.length - 1 && c == mat[0].length - 1) {
			return mat[r][c];
		}
		if (dp[r][c] != 0) {
			return dp[r][c];
		}
		int sp1 = mat[r][c] + solveTD(mat, r, c + 1, dp);// Right
		int sp2 = mat[r][c] + solveTD(mat, r + 1, c, dp);// Down
		dp[r][c] = Math.min(sp1, sp2);
		return Math.min(sp1, sp2);

	}

	public static int solveBU(int[][] mat) {
		int[][] dp = new int[mat.length + 1][mat[0].length + 1];
		for (int r = mat.length; r >= 0; r--) {
			for (int c = mat[0].length; c >= 0; c--) {
//				dp[r][c]!!
				if (r == mat.length || c == mat[0].length) {
//					-ve BC
					dp[r][c] = 20000;// an answer which can never exist
					continue;
				}
				if (r == mat.length - 1 && c == mat[0].length - 1) {
					dp[r][c] = mat[r][c];
					continue;
				}
				int sp1 = mat[r][c] + dp[r][c + 1];// Right
				int sp2 = mat[r][c] + dp[r + 1][c];// Down
				dp[r][c] = Math.min(sp1, sp2);
			}
		}
		return dp[0][0];
	}
}
