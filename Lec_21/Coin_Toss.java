package Lec_21;

public class Coin_Toss {
	public static void main(String[] args) {
		CToss(3,"");
	}

	public static void CToss(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CToss(n - 1, path + "H");
		CToss(n - 1, path + "T");

	}
}
