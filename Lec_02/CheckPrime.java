package Lec_02;

public class CheckPrime {
	public static void main(String[] args) {
		int n = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8;
		int div = 1;
		int factors = 0;
		while (div <= n) {
			int rem = n % div;
			if (rem == 0) {
				factors = factors + 1;
//				System.out.println(div);
			}
			div++;
		}
//		System.out.println(factors);
		if (factors == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not pime");
		}
	}
}
