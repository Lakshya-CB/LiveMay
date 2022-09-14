package Lec_35;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Fibo(n,new int[n+1]));
	}

	public static int Fibo(int n, int[] dp) {
		if (n <= 1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int sp1 = Fibo(n - 1, dp);
		int sp2 = Fibo(n - 2, dp);
//		fibo(n)!!
		dp[n] = sp1 + sp2;

		return sp1 + sp2;
	}
}
