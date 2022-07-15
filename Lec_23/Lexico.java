package Lec_23;

public class Lexico {
	public static void main(String[] args) {
//		sove(1, 1000);
//		sove(2, 1000);
//		sove(3, 1000);
//		sove(4, 1000);
//		sove(5, 1000);
//		sove(6, 1000);
//		sove(7, 1000);
//		sove(8, 1000);
//		sove(9, 1000);
		sove(0, 1000);
	}

	public static void sove(int curr, int limit) {
		if (curr > limit) {
			return;
		}

		System.out.println(curr);
		int d = 0;
		if (curr == 0) {
			d = 1;
		}
		for (; d <= 9; d++) {
			sove(curr * 10 + d, limit);
		}
	}
}
