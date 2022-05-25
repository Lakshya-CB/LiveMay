package Lec_04;

public class Prime_Factor {
	public static void main(String[] args) {
		int num = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9;
		int div = 2;
		while (num>1) {
			if (num % div == 0) {
				num = num / div;
				System.out.println(div);
			} else {
				div++;
			}
		}
	}
}
