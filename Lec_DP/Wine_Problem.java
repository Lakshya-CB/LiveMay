package Lec_36_37_DP;

public class Wine_Problem {
	public static void main(String[] args) {
		int[] daaru = { 2, 3, 5, 1, 4 };
//		System.out.println(solve(daaru, 0, daaru.length - 1));
		System.out.println(BU(daaru));
	}

	public static int solve(int[] daaru, int s, int e, int day) {
		if (s > e) {
			return 0;
		}
		int sp1 = daaru[s] * day + solve(daaru, s + 1, e, day + 1);
		int sp2 = daaru[e] * day + solve(daaru, s, e - 1, day + 1);
		return Math.max(sp1, sp2);
	}

	public static int solve(int[] daaru, int s, int e) {
		if (s > e) {
			return 0;
		}
		int bottle_sold = daaru.length - (e + 1 - s);
		int day = bottle_sold + 1;
		int sp1 = daaru[s] * day + solve(daaru, s + 1, e);
		int sp2 = daaru[e] * day + solve(daaru, s, e - 1);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] daaru) {
		int[][] dp = new int[daaru.length+1][daaru.length];
		for (int s = daaru.length - 1; s >= 0; s--) {
			for (int e = 0; e < daaru.length; e++) {
//				dp[s][e]
				if (s > e) {
					continue;
				}
				int bottle_sold = daaru.length - (e + 1 - s);
				int day = bottle_sold + 1;
				int sp1 = daaru[s] * day + dp[s + 1][e];

				int sp2 = daaru[e] * day;
				if (e >= 1) {
					sp2 = sp2 + dp[s][e - 1];
				}
				dp[s][e] = Math.max(sp1, sp2);
			}
		}
		return dp[0][daaru.length - 1];
	}

}
