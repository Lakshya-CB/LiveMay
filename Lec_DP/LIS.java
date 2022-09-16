package Lec_38;

public class LIS {
	public static void main(String[] args) {

	}

	public static int solve(int[] arr, int idx, int prev) {
		if (idx == arr.length) {
			return 0;
		}
		int sp1 = 0;
		if (arr[idx] > prev) {
			sp1 = 1 + solve(arr, idx + 1, arr[idx]); // include!
		}
		int sp2 = solve(arr, idx + 1, prev);
		return Math.max(sp1, sp2);
	}

	public static int solve2(int[] arr, int idx, int previdx, int[][] dp) {
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][previdx + 1] != 0) {
			return dp[idx][previdx + 1];
		}
		int sp1 = 0;
		if (arr[idx] > arr[previdx]) {
			sp1 = 1 + solve2(arr, idx + 1, idx, dp); // include!
		}
		int sp2 = solve2(arr, idx + 1, previdx, dp);
		dp[idx][previdx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
}
