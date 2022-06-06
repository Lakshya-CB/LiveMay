package Lec_05;

public class Binary_to_decimal {
	public static void main(String[] args) {
		int num = 13;
		int mult = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 2;
//			System.out.println(digit);
			num = num / 2;
			ans = ans + mult * digit;
			mult = mult * 10;

		}
		System.out.println(ans);

	}
}
