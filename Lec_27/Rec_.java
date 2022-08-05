package Lec_27;

public class Rec_ {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		CoinDen_user(arr, 0, 5, "");
	}

	public static void CoinDen(int[] coins, int s, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (s == coins.length || A < 0) {
			return;
		}
		CoinDen(coins, s, A - coins[s], path + coins[s]);
		CoinDen(coins, s + 1, A, path);
	}

	public static void CoinDen_user(int[] coins, int last, int A, String path) {
		if (A == 0) {
			System.out.println(path);
			return;
		}
		if (A < 0) {
			return;
		}
		for (int i = last; i < coins.length; i++) {
			CoinDen_user(coins, i, A - coins[i], path + coins[i]);
		}
	}
}
