package Lec_DP;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 1100000;
//		System.out.println(Fibo(n));
//		System.out.println(FiboTD(n, new int[n + 1]));?
		System.out.println(FiboTB(n));
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int FiboTD(int n, int[] dp) {
		if (n <= 1) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n]; // use kiya the same memory
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
		dp[n] = sp1 + sp2;// memorization
		return sp1 + sp2;
	}

//	tabulation!!
	public static int FiboTB(int Nth) {
		int[] dp = new int[Nth+1]; // ?
		dp[0] = 0;
		dp[1] = 1;
		for (int n = 2; n <= Nth; n++) {
//			dp[n]!!
			int sp1 = dp[n - 1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;// memorization
		}
		return dp[Nth];// biggest Problem!!
	}
}
