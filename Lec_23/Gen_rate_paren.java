package Lec_23;

public class Gen_rate_paren {
	public static void main(String[] args) {
		Genrate(4, 4, "");
	}

	public static void Genrate(int open, int close, String path) {
		if (open == 0 && close == 0) {
			System.out.println(path);
			return;
		}
		if (open > close) {
			return;
		}
		if (open > 0) {
			Genrate(open - 1, close, path + "(");
		}
		if (close > 0) {
			Genrate(open, close - 1, path + ")");
		}
	}

}
